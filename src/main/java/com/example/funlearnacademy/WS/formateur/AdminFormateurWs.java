package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Admin;
import com.example.funlearnacademy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping
public class AdminFormateurWs {
    @Autowired
    private AdminService adminService;

    @DeleteMapping("/admin/{email}")
    public int deleteByEmail(@PathVariable String email) {
        return adminService.deleteByEmail(email);
    }
    @GetMapping("/")
    public List<Admin> findAll() {
        return adminService.findAll();
    }
    @GetMapping("/admin/{id}")
    public Admin findAdminById(@PathVariable Long id) {
        return adminService.findAdminById(id);
    }
    @PostMapping("/")
    public Admin save(@RequestBody Admin admin) {
        return adminService.save(admin);
    }
}
