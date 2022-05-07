package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("formateur/formateur")
public class FormateurFormateurWs {
    @Autowired
    private FormateurService formateurService;

    @GetMapping("/ref/{ref}")
    public Formateur findByRef(@PathVariable String ref) {
        return formateurService.findByRef(ref);
    }

    @PostMapping("/")
    public Formateur save(@RequestBody Formateur formateur) {
        return formateurService.save(formateur);
    }

    @GetMapping("/")
    public List<Formateur> findAll() {
        return formateurService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return formateurService.deleteByRef(ref);
    }
}
