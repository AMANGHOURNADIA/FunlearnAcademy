package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FormateurApprenantWs {
    @Autowired
    private FormateurService formateurService;

    @GetMapping("/find/{ref}")
    public Formateur findByRef(String ref) {
        return formateurService.findByRef(ref);
    }

    @PostMapping("/")
    public Formateur save(Formateur formateur) {
        return formateurService.save(formateur);
    }

    @GetMapping("/")
    public Formateur findAll() {
        return formateurService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(String ref) {
        return formateurService.deleteByRef(ref);
    }
}
