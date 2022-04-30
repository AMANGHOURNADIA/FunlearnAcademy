package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Apprenant;
import com.example.funlearnacademy.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ApprenantApprenantWs {
    @Autowired
    private ApprenantService apprenantService;

    @GetMapping("/find/{reference}")
    public Apprenant findByReference(String reference) {
        return apprenantService.findByReference(reference);
    }

    @DeleteMapping("/delete/{reference}")
    public int deleteByReference(String reference) {
        return apprenantService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Apprenant> findAll() {
        return apprenantService.findAll();
    }

    @PostMapping("/")
    public Apprenant save(Apprenant apprenant) {
        return apprenantService.save(apprenant);
    }
}
