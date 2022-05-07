package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Chapitre;
import com.example.funlearnacademy.service.ChapitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/chapitre")
public class AdminChapitreWs {
    @Autowired
    private ChapitreService chapitreService;

    @GetMapping("/Section/{id}")
    public List<Chapitre> findBySectionIdOrderByNumeroOrder(@PathVariable Long id) {
        return chapitreService.findBySectionIdOrderByNumeroOrder(id);
    }

    @GetMapping("/Section/{id}")
    public List<Chapitre> findBySectionId(@PathVariable Long id) {
        return chapitreService.findBySectionId(id);
    }

    @DeleteMapping("/id/{id}")
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
