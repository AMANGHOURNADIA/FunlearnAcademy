package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Apprenant;
import com.example.funlearnacademy.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formateur/apprenant")
public class FormateurApprenantWs {
    @Autowired
    private ApprenantService apprenantService;

    @GetMapping("/reference/{reference}")
    public Apprenant findByReference(@PathVariable String reference) {
        return apprenantService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return apprenantService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Apprenant> findAll() {
        return apprenantService.findAll();
    }

    @PostMapping("/")
    public Apprenant save(@RequestBody Apprenant apprenant) throws Exception {
        return apprenantService.save(apprenant);
    }
}
