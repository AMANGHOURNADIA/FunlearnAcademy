package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Categorie;
import com.example.funlearnacademy.bean.CategorieItem;
import com.example.funlearnacademy.dao.CategorieItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CategorieItemService {
    @Autowired
    private CategorieItemDao categorieItemDao;
    @Autowired
    private CategorieService categorieService;

    public Optional<CategorieItem> findById(Long id) {
        return categorieItemDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        categorieItemDao.deleteById(id);
    }

    public List<CategorieItem> findAll() {
        return categorieItemDao.findAll();
    }

    public CategorieItem save(CategorieItem categorieItem) throws Exception {
        Optional<Categorie> categorie = this.categorieService.findById(categorieItem.getCategorie().getId());
        if (!categorie.isPresent()) {
            throw new Exception("Category not found !");
        }
        categorieItem.setCategorie(categorie.get());
        return categorieItemDao.save(categorieItem);
    }

    public List<CategorieItem> findByCategorieId(Long id) {
        return categorieItemDao.findByCategorieId(id);
    }
}

