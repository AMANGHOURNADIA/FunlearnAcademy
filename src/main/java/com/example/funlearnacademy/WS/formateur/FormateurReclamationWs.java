package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Reclamation;
import com.example.funlearnacademy.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("formateur/reclamation")
public class FormateurReclamationWs {
    @Autowired
    private ReclamationService reclamationService;
    @GetMapping("id/{id}")
    public Reclamation findReclamationById(@PathVariable Long id) {
        return reclamationService.findReclamationById(id);
    }
    @GetMapping("user/{id}")
    public List<Reclamation> findReclamationByUserId(@PathVariable Long id) {
        return reclamationService.findReclamationByUserId(id);
    }
    @GetMapping("user/id/{id}")
    public Reclamation findReclamationByIdAndUserId(@PathVariable Long id) {
        return reclamationService.findReclamationByIdAndUserId(id);
    }
    @GetMapping("/")
    public List<Reclamation> findAll() {
        return reclamationService.findAll();
    }
    @PostMapping("/")
    public Reclamation save(@RequestBody Reclamation reclamation) {
        return reclamationService.save(reclamation);
    }
    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        reclamationService.deleteById(id);
    }
}
