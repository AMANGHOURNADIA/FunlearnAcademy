package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Inscription;
import com.example.funlearnacademy.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/inscription")
public class AdminInscriptionWs {
    @Autowired
    private InscriptionService inscriptionService;

    @GetMapping("/number/{number}")
    public Inscription findByNumber(@PathVariable Integer number) {
        return inscriptionService.findByNumber(number);
    }

    @GetMapping("/apprenant/id/{id}")
    public Inscription findInscriptionByApprenantId(@PathVariable Long id) {
        return inscriptionService.findInscriptionByApprenantId(id);
    }

    @DeleteMapping("/number/{number}")
    public int deleteByNumber(@PathVariable Integer number) {
        return inscriptionService.deleteByNumber(number);
    }

    @DeleteMapping("/apprenant/refernece/{reference}")
    public int deleteByApprenantReference(@PathVariable String reference) {
        return inscriptionService.deleteByApprenantReference(reference);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        inscriptionService.deleteById(id);
    }

    @DeleteMapping("/apprenant/id/{id}")
    public int deleteInscriptionByApprenantId(@PathVariable Long id) {
        return inscriptionService.deleteInscriptionByApprenantId(id);
    }

    @GetMapping("/id/{id}")
    public Inscription findInscriptionById(@PathVariable Long id) {
        return inscriptionService.findInscriptionById(id);
    }

    @GetMapping("/apprenant/username/{username}")
    public Inscription findInscriptionByApprenantUsername(@PathVariable String username) {
        return inscriptionService.findInscriptionByApprenantUsername(username);
    }

    @GetMapping("/")
    public List<Inscription> findAllByOrderByIdDesc() {
        return inscriptionService.findAllByOrderByIdDesc();
    }

    @PostMapping("/")
    public Inscription save(@RequestBody Inscription inscription) throws Exception {
        return inscriptionService.save(inscription);
    }
}
