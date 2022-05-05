package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public User save(User user) {
        return  userDao.save(user);
    }

    public void deleteById(Long id) {
        userDao.deleteById(id);
    }



    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }

    public int deleteByUsername(String username) {
        return userDao.deleteByUsername(username);
    }

    @Autowired
    protected UserDao userDao;

}
