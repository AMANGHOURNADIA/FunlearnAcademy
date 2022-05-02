package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Chapitre;
import com.example.funlearnacademy.service.ChapitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping
public class ChapitreFormateurWs {
    @Autowired
    private ChapitreService chapitreService;
    @GetMapping("/find/chapitre/{id}")
    public List<Chapitre> findBySectionSection_idOrderByNumeroOrder(@PathVariable Long id) {
        return chapitreService.findBySectionSection_idOrderByNumeroOrder(id);
    }
    @GetMapping("/sectino_id/{id}")
    public List<Chapitre> findBySectionSection_id(@PathVariable Long id) {
        return chapitreService.findBySectionSection_id(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        chapitreService.deleteById(id);
    }
    @GetMapping("/")
    public List<Chapitre> findAll() {
        return chapitreService.findAll();
    }
    @PostMapping("/")
    public Chapitre save(@RequestBody Chapitre chapitre) {
        return chapitreService.save(chapitre);
    }
}
