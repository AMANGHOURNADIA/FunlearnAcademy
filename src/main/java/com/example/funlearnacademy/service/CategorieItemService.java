package com.example.funlearnacademy.service;


import com.example.funlearnacademy.bean.CategorieItem;
import com.example.funlearnacademy.dao.CategorieItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategorieItemService {
    @Autowired
    private CategorieItemDao categorieItemDao;

    public List<CategorieItem> findByCategorieCode(String code) {
        return categorieItemDao.findByCategorieCode(code);
    }

    public int deleteByCategorieCode(String code) {
        return categorieItemDao.deleteByCategorieCode(code);
    }

    public CategorieItem findByReference(String reference) {
        return categorieItemDao.findByReference(reference);
    }
   @Transactional
    public int deleteByReference(String reference) {
        return categorieItemDao.deleteByReference(reference);
    }

    public List<CategorieItem> findAll() {
        return categorieItemDao.findAll();
    }

    public CategorieItem save(CategorieItem categorieItem) {
        return categorieItemDao.save(categorieItem);
    }
}
