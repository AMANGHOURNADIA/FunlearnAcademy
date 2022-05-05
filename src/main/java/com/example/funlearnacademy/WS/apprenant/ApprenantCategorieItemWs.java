package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.CategorieItem;
import com.example.funlearnacademy.service.CategorieItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apprenant/CategoriesItem")
public class ApprenantCategorieItemWs {
    @Autowired
    private CategorieItemService categorieItemService;
    @GetMapping("/id/{id}")
    public Optional<CategorieItem> findById(@PathVariable Long id) {
        return categorieItemService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieItemService.deleteById(id);
    }

    @GetMapping("/")
    public List<CategorieItem> findAll() {
        return categorieItemService.findAll();
    }
    @PostMapping("/")
    public CategorieItem save(@RequestBody CategorieItem categorieItem) {
        return categorieItemService.save(categorieItem);
    }
}
