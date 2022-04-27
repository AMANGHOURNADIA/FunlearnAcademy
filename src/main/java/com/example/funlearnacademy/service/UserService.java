package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public int register(User user) {
        if (findByEmail(user.getEmail()) == null) {
            return -1;
        } else if (user.getPassword().length() < 8) {
            return -2;
        } else
            return 1;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }


    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public List<User> findByRole(String role) {
        return userDao.findByRole(role);
    }

    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }

  /*  public User updateUser(User user) {
        System.out.println(user.getId());
        User localUser = register(user.getEmail());
        localUser.setId(user.getId());
        localUser.setFirstname(user.getFirstname());
        localUser.setLastname(user.getLastname());
        localUser.setUsername(user.getUsername());
        localUser.setRole(user.getRole());
        localUser.setPassword(user.getPassword());
        localUser.setConfirmpassword(user.getConfirmpassword());
        return userDao.save(localUser);
    }*/

    @Autowired
    protected UserDao userDao;

}
