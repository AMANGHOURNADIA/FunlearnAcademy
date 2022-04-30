package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Sujet;
import com.example.funlearnacademy.service.SujetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping
public class SujetAdminWs {
    @Autowired
    private SujetService sujetService;
    @GetMapping("/id/{id}")
    public Sujet findByid(@PathVariable Long id) {
        return sujetService.findByid(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        sujetService.deleteById(id);
    }
    @GetMapping("/")
    public List<Sujet> findAll() {
        return sujetService.findAll();
    }
    @PostMapping("/")
    public Sujet save(@RequestBody Sujet sujet) {
        return sujetService.save(sujet);
    }
}
