package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Cours;
import com.example.funlearnacademy.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apprenant/cours")
public class ApprenantCoursWs {
    @Autowired
    private CoursService coursService;

    @GetMapping("/id/{id}")
    public Optional<Cours> findById(@PathVariable Long id) {
        return coursService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        coursService.deleteById(id);
    }

    @GetMapping("/")
    public List<Cours> findAll() {
        return coursService.findAll();
    }

    @PostMapping("/")
    public Cours save(@RequestBody Cours cours) throws Exception {
        return coursService.save(cours);
    }
}
