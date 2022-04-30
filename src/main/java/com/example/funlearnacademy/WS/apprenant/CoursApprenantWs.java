package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Cours;
import com.example.funlearnacademy.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping
public class CoursApprenantWs {
    @Autowired
    private CoursService coursService;
    @GetMapping("/id/{id}")
    public Optional<Cours> findById(Long id) {
        return coursService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(Long id) {
        coursService.deleteById(id);
    }
    @GetMapping("/")
    public List<Cours> findAll() {
        return coursService.findAll();
    }
    @PostMapping("/")
    public Cours save(Cours cours) {
        return coursService.save(cours);
    }
}
