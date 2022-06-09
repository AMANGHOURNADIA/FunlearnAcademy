package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.CategorieItem;
import com.example.funlearnacademy.bean.Sujet;
import com.example.funlearnacademy.dao.SujetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SujetService {
    @Autowired
    private SujetDao sujetDao;

    public Optional<Sujet> findById(Long aLong) { // virification objet if exist mathtihach f controller
        return sujetDao.findById(aLong);
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

    public Sujet findByid(Long id) { // get object by id htiha f controller
        return sujetDao.findSujetById(id);
    }
}
