package com.example.funlearnacademy.service.facade;

import com.example.funlearnacademy.bean.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService extends UserDetailsService {
    ResponseEntity<User> signIn(User user);

    User save(User user) throws Exception;

    List<User> findAll();

    String generatePassword();

    void deleteUserById(Long id);

    User updateUser(User user);
     User findByEmail(String email) throws Exception;
}
