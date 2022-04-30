package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Categorie;
import com.example.funlearnacademy.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class CategorieAdminWs {
    @Autowired
    private CategorieService categorieService;
    @GetMapping("/find/{id}")
    public Optional<Categorie> findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("/delet/{name}")
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
}
