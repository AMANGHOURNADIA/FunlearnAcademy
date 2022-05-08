package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Role;
import com.example.funlearnacademy.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apprenant/role")
public class ApprenantRoleWs {
    @Autowired
    private RoleServiceImpl roleService;
    @GetMapping("/authority/{authority}")
    public Role findByAuthority(@PathVariable String authority) {
        return roleService.findByAuthority(authority);
    }

    @PostMapping("/")
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }
}
