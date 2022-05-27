package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Categorie;
import com.example.funlearnacademy.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin/categorie")
public class AdminCategorieWs {
    @Autowired
    private CategorieService categorieService;

    @GetMapping("/id/{id}")
    public Optional<Categorie> findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }

    @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping("/")
    public Categorie save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }
    @PutMapping("/")
    public Categorie update(@RequestBody Categorie categorie){
      return  categorieService.save(categorie);
    }
}
