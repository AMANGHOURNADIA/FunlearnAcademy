package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Inscription;
import com.example.funlearnacademy.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping
public class InscriptionApprenantWs {
    @Autowired
    private InscriptionService inscriptionService;

    @GetMapping("/number/{number}")
    public Inscription findByNumber(@PathVariable Integer number) {
        return inscriptionService.findByNumber(number);
    }

    @GetMapping("/id/{id}")
    public Inscription findInscriptionByApprenantId(@PathVariable Long id) {
        return inscriptionService.findInscriptionByApprenantId(id);
    }

    @DeleteMapping("/delete/{number}")
    public int deleteByNumber(@PathVariable Integer number) {
        return inscriptionService.deleteByNumber(number);
    }

    @DeleteMapping("/delete/{reference}")
    public int deleteByApprenantReference(@PathVariable String reference) {
        return inscriptionService.deleteByApprenantReference(reference);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        inscriptionService.deleteById(id);
    }

    @DeleteMapping("/Apprenant/delete/{id}")
    public int deleteInscriptionByApprenantId(@PathVariable Long id) {
        return inscriptionService.deleteInscriptionByApprenantId(id);
    }

    @GetMapping("/find/Apprenant/{id}")
    public List<Inscription> findInscriptionsByApprenantId(@PathVariable Long id) {
        return inscriptionService.findInscriptionsByApprenantId(id);
    }

    @GetMapping("/find/inscription/{id}")
    public Inscription findInscriptionById(@PathVariable Long id) {
        return inscriptionService.findInscriptionById(id);
    }

    @GetMapping("/inscription/{username}")
    public Inscription findInscriptionByApprenantUsername(@PathVariable String username) {
        return inscriptionService.findInscriptionByApprenantUsername(username);
    }

    @GetMapping("/")
    public List<Inscription> findAllByOrderByIdDesc() {
        return inscriptionService.findAllByOrderByIdDesc();
    }

    @PostMapping("/")
    public Inscription save(Inscription inscription) {
        return inscriptionService.save(inscription);
    }
}
