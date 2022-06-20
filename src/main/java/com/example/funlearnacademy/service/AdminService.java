package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Admin;
import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.dao.AdminDao;
import com.example.funlearnacademy.dao.UserDao;
import com.example.funlearnacademy.filter.JwtConstant;
import com.example.funlearnacademy.service.facade.RoleService;
import com.example.funlearnacademy.service.facade.UserService;
import com.example.funlearnacademy.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static com.example.funlearnacademy.filter.RoleConstant.ROLE_ADMIN;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public int deleteByEmail(String email) {
        return adminDao.deleteByEmail(email);
    }

    public Admin update(Admin admin) {
        return adminDao.save(admin);
    }

    public List<Admin> findAll() {
        return adminDao.findAll();
    }


    public Admin findAdminById(Long id) {
        return adminDao.findAdminById(id);
    }


    public Admin save(Admin admin) throws Exception {
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());
        admin.setAuthorities(Arrays.asList(new Role(ROLE_ADMIN)));
        admin.setRole(ROLE_ADMIN);
        System.out.println(admin.getRole());
        this.findAdminByEmail(admin.getEmail());
        this.findAdminByUsername(admin.getUsername());
//            prepareMessage(user);
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        admin.setImage(getTemporaryProfileImageUrl(admin.getUsername()));
        roleService.save(admin.getAuthorities());
        return adminDao.save(admin);

    }

    private String getTemporaryProfileImageUrl(String username) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path(JwtConstant.DEFAULT_USER_IMAGE_PATH + username).toUriString();
    }

    public void findAdminByEmail(String email) throws Exception {
        Admin admin = adminDao.findAdminByEmail(email);
        if (admin != null) {
            throw new Exception("Email already exist");
        }
    }

    public void findAdminByUsername(String username) throws Exception {
        Admin admin = adminDao.findByUsername(username);
        if (admin != null) {
            throw new Exception("Username already exist");
        }
    }


}
