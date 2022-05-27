package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Admin;
import com.example.funlearnacademy.bean.Apprenant;
import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.dao.ApprenantDao;
import com.example.funlearnacademy.dao.UserDao;
import com.example.funlearnacademy.filter.JwtConstant;
import com.example.funlearnacademy.service.facade.RoleService;
import com.example.funlearnacademy.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static com.example.funlearnacademy.filter.RoleConstant.ROLE_ADMIN;
import static com.example.funlearnacademy.filter.RoleConstant.ROLE_APPRENANT;

@Service
public class ApprenantService {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private ApprenantDao apprenantDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Apprenant findByReference(String reference) {
        return apprenantDao.findByReference(reference);
    }
    @Transactional
    public int deleteByReference(String reference) {
        return apprenantDao.deleteByReference(reference);
    }

    public List<Apprenant> findAll() {
        return apprenantDao.findAll();
    }


    public Apprenant save(Apprenant apprenant) throws Exception {
        System.out.println(apprenant.getUsername());
        System.out.println(apprenant.getPassword());
        apprenant.setAuthorities(Arrays.asList(new Role(ROLE_APPRENANT)));
        apprenant.setRole(ROLE_APPRENANT);
        System.out.println(apprenant.getRole());
        this.findByUsername(apprenant.getUsername());
        this.findByEmail(apprenant.getEmail());
            apprenant.setPassword(passwordEncoder.encode(apprenant.getPassword()));
            apprenant.setImage(getTemporaryProfileImageUrl(apprenant.getUsername()));
            roleService.save(apprenant.getAuthorities());
            return apprenantDao.save(apprenant);

    }
    private String getTemporaryProfileImageUrl(String username) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path(JwtConstant.DEFAULT_USER_IMAGE_PATH + username)
                .toUriString();
    }

    public void findByEmail(String email) throws Exception {
        Apprenant apprenant = apprenantDao.findByEmail(email);
        if (apprenant != null) {
            throw new Exception("Email already exist");
        }
    }

    public void findByUsername(String username) throws Exception {
        Apprenant apprenant = apprenantDao.findByUsername(username);
        if (apprenant != null) {
            throw new Exception("Username already exist");
        }
    }
}
