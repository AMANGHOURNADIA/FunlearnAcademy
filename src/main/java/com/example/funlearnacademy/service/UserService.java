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

    public int save(User user) {
        if (findByEmail(user.getEmail()) != null) {
            return -1;
        } else {
            userDao.save(user);
            return 1;
        }
    }

    public void deleteById(Long id) {
        userDao.deleteById(id);
    }


    public User update(User user) {
        return userDao.upedate(user);
    }

    public User findByUsernameWithRole(String username) {
        return userDao.findByUsernameWithRole(username);
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
