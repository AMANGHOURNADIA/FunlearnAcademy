package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Categorie;
import com.example.funlearnacademy.dao.CategorieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {
    @Autowired
    private CategorieDao categorieDao;

    public Optional<Categorie> findById(Long id) {
        return categorieDao.findById(id);
    }

    public Categorie findByName(String name) {
        return categorieDao.findByName(name);
    }
    @Transactional
    public void deleteByCode(String name) {
        categorieDao.deleteByCode(name);
    }

    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    public Categorie save(Categorie categorie) {
        return categorieDao.save(categorie);
    }
}
