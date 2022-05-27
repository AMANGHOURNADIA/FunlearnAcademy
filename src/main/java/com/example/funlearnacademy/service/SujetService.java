package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.CategorieItem;
import com.example.funlearnacademy.bean.Sujet;
import com.example.funlearnacademy.dao.SujetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class SujetService {
    @Autowired
    private SujetDao sujetDao;

    public Sujet findByid(Long id) {
        return sujetDao.findByid(id);
    }
  @Transactional
    public void deleteById(Long id) {
        sujetDao.deleteById(id);
    }

    public List<Sujet> findAll() {
        return sujetDao.findAll();
    }

    public Sujet save(Sujet sujet) {
        return sujetDao.save(sujet);
    }

    public List<Sujet> findByCategorieItemId(Long id) {
        return sujetDao.findByCategorieItemId(id);
    }
}
