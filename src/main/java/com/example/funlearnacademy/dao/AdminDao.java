package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
    Admin findAdminByEmail(String email);
    Admin findAdminById(Long id);
    int deleteByEmail(String email);
}
