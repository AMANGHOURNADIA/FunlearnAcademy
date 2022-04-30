package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;

    public Role findByAuthority(String authority) {
        return roleDao.findByAuthority(authority);
    }

    public List<Role> findAll() {
        return roleDao.findAll();
    }

    public Role  save(Role role) {
        return roleDao.save(role);
    }
}
