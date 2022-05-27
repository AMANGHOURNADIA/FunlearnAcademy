package com.example.funlearnacademy.service;


import com.example.funlearnacademy.bean.Admin;
import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.dao.FormateurDao;
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
import static com.example.funlearnacademy.filter.RoleConstant.ROLE_FROMATEUR;

@Service
public class FormateurService {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleService roleService;
    @Autowired
    private FormateurDao formateurDao;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public Formateur findByRef(String ref) {
        return formateurDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return formateurDao.deleteByRef(ref);
    }

    public List<Formateur> findAll() {
        return formateurDao.findAll();
    }


    public Formateur save(Formateur formateur) throws Exception {
        System.out.println(formateur.getUsername());
        System.out.println(formateur.getPassword());
        formateur.setAuthorities(Arrays.asList(new Role(ROLE_FROMATEUR)));
        formateur.setRole(ROLE_FROMATEUR);
        System.out.println(formateur.getRole());
        this.findByEmail(formateur.getEmail());
        this.findByUsername(formateur.getUsername());
//            prepareMessage(user);
        formateur.setPassword(passwordEncoder.encode(formateur.getPassword()));
        formateur.setImage(getTemporaryProfileImageUrl(formateur.getUsername()));
        roleService.save(formateur.getAuthorities());
        return formateurDao.save(formateur);

    }

    private String getTemporaryProfileImageUrl(String username) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path(JwtConstant.DEFAULT_USER_IMAGE_PATH + username)
                .toUriString();
    }

    public void findByEmail(String email) throws Exception {
        Formateur formateur = formateurDao.findByEmail(email);
        if (formateur != null) {
            throw new Exception("Email already exist");
        }
    }

    public void findByUsername(String username) throws Exception {
        Formateur formateur = formateurDao.findByUsername(username);
        if (formateur != null) {
            throw new Exception("Username already exist");
        }
    }


}
