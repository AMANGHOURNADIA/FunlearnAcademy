package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Admin;
import com.example.funlearnacademy.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserServiceImpl userService;

    @Transactional
    public int deleteByEmail(String email) {
        return adminDao.deleteByEmail(email);
    }

    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    public Admin findAdminById(Long id) {
        return adminDao.findAdminById(id);
    }

    public Admin save(Admin admin) {
        return adminDao.save(admin);
    }



}
