package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.dao.UserDao;
import com.example.funlearnacademy.exception.NotAnImageFileException;
import com.example.funlearnacademy.filter.JwtConstant;
import com.example.funlearnacademy.filter.RoleConstant;
import com.example.funlearnacademy.service.facade.RoleService;
import com.example.funlearnacademy.service.facade.UserService;
import com.example.funlearnacademy.util.JwtUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.example.funlearnacademy.filter.RoleConstant.ROLE_ADMIN;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.*;

@Service
public class UserServiceImpl implements UserService {
    private Logger LOGGER = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public ResponseEntity<User> signIn(User user) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("bad credited for username " + user.getUsername());
        }
        User loadUserByUsername = loadUserByUsername(user.getUsername());
//        HttpHeaders jwtHeader = getJwtHeader(user);
        String jwt = jwtUtil.generateToken(user);
        loadUserByUsername.setToken(jwt);
        HttpHeaders jwtHeader = new HttpHeaders();
        jwtHeader.clearContentHeaders();
        jwtHeader.set(JwtConstant.JWT_TOKEN_HEADER, jwt);
        return ResponseEntity.ok().headers(jwtHeader).body(loadUserByUsername);
    }

    private HttpHeaders getJwtHeader(User user) {
        HttpHeaders headers = new HttpHeaders();
        String jwt = jwtUtil.generateToken(user);
        System.out.println(jwt);
        headers.set(JwtConstant.JWT_TOKEN_HEADER, jwt);
        return headers;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }


    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User findByEmail(String email) throws Exception {
        User user = userDao.findByEmail(email);
        if (user != null) {
            throw new Exception("Email already exist !");
        }
        return user;
    }


    @Override
    public User save(User user) throws Exception {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        user.setAuthorities(Arrays.asList(new Role(ROLE_ADMIN)));
        user.setRole(ROLE_ADMIN);
        System.out.println(user.getRole());
        User loadedUserByUsername = userDao.findByUsername(user.getUsername());
        this.findByEmail(user.getEmail());
        if (loadedUserByUsername != null) throw new Exception("Username already exist !");
        else {
//            prepareMessage(user);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setImage(getTemporaryProfileImageUrl(user.getUsername()));
            roleService.save(user.getAuthorities());
            return userDao.save(user);
        }
    }

    public void deleteById(Long id) {
        userDao.deleteById(id);
    }


    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }

    public int deleteByUsername(String username) {
        return userDao.deleteByUsername(username);
    }


    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if (user == null || user.getId() == null) {
            throw new UsernameNotFoundException("user " + username + " not founded");
        } else {
            return user;
        }
    }

    private String setProfileImageUrl(String username) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path(JwtConstant.USER_IMAGE_PATH + username + JwtConstant.FORWARD_SLASH + username + JwtConstant.DOT + JwtConstant.JPG_EXTENSION).toUriString();
    }


    private String getTemporaryProfileImageUrl(String username) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path(JwtConstant.DEFAULT_USER_IMAGE_PATH + username).toUriString();
    }

    private void saveProfileImage(User user, MultipartFile profileImage) throws IOException, NotAnImageFileException {

        System.out.println(user.getUsername());
        if (profileImage != null) {
            if (!Arrays.asList(IMAGE_JPEG_VALUE, IMAGE_PNG_VALUE, IMAGE_GIF_VALUE).contains(profileImage.getContentType())) {
                throw new NotAnImageFileException(profileImage.getOriginalFilename() + JwtConstant.NOT_AN_IMAGE_FILE);
            }
            Path userFolder = Paths.get(JwtConstant.USER_FOLDER + user.getUsername()).toAbsolutePath().normalize();
            if (!Files.exists(userFolder)) {
                Files.createDirectories(userFolder);
                LOGGER.info(JwtConstant.DIRECTORY_CREATED + userFolder);
            }
            Files.deleteIfExists(Paths.get(userFolder + user.getUsername() + JwtConstant.DOT + JwtConstant.JPG_EXTENSION));
            Files.copy(profileImage.getInputStream(), userFolder.resolve(user.getUsername() + JwtConstant.DOT + JwtConstant.JPG_EXTENSION), REPLACE_EXISTING);
            user.setImage(setProfileImageUrl(user.getUsername()));
            this.userDao.save(user);
            LOGGER.info(JwtConstant.FILE_SAVED_IN_FILE_SYSTEM + profileImage.getOriginalFilename());
        }
    }

    public User updateProfileImage(String username, MultipartFile profileImage) throws IOException, NotAnImageFileException {
        User user = this.loadUserByUsername(username);
        saveProfileImage(user, profileImage);
        return user;
    }

    public User resetPassword(User user) {
        User loadUserByUsername = this.loadUserByUsername(user.getUsername());
        loadUserByUsername.setPassword(passwordEncoder.encode(user.getPassword()));
        return userDao.save(loadUserByUsername);
    }

    public void forgetPassword(String email) throws Exception {
        User loadUserByUsername = this.findUserByEmail(email);
        String password = this.generatePassword();
        System.out.println(password);
        loadUserByUsername.setPassword(passwordEncoder.encode(password));
        userDao.save(loadUserByUsername);
    }
    public User findUserByEmail(String email) throws Exception {
        User user = userDao.findByEmail(email);
        if (user == null) {
            throw new Exception("Email doesn't  exist !");
        }
        return user;
    }
}
