package com.example.funlearnacademy.service;

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

    public Optional<CategorieItem> findById( Long id) {
        return categorieItemDao.findById(id);
    }
    @Transactional
    public void deleteById( Long id) {
        categorieItemDao.deleteById(id);
    }
    public List<CategorieItem> findAll() {
        return categorieItemDao.findAll();
    }

    public  CategorieItem save( CategorieItem categorieItem) {
        return categorieItemDao.save(categorieItem);
    }
}

