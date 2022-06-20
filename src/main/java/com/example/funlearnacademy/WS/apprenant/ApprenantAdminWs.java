package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Admin;
import com.example.funlearnacademy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apprenant/admin")
public class ApprenantAdminWs {
    @Autowired
    private AdminService adminService;

    @DeleteMapping("/email/{email}")
    public int deleteByEmail(@PathVariable String email) {
        return adminService.deleteByEmail(email);
    }

    @GetMapping("/")
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @GetMapping("/id/{id}")
    public Admin findAdminById(@PathVariable Long id) {
        return adminService.findAdminById(id);
    }

    @PostMapping("/")
    public Admin save(@RequestBody Admin admin) throws Exception{
        return adminService.save(admin);
    }
    @PostMapping("/update")
    public Admin update(@RequestBody Admin admin) throws Exception {
        return adminService.update(admin);
    }
}
