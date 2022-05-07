package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("formateur/role")
public class FormateurRoleWs {
    @Autowired
    private RoleService roleService;
    @GetMapping("/authority/{authority}")
    public Role findByAuthority(@PathVariable String authority) {
        return roleService.findByAuthority(authority);
    }
    @GetMapping("/")
    public List<Role> findAll() {
        return roleService.findAll();
    }
    @PostMapping("/")
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }
}