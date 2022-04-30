package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Sujet;
import com.example.funlearnacademy.dao.SujetDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SujetService {
    public List<Sujet> findBySujet_name(String sujet_name) {
        return sujetDao.findsBySujet_name(sujet_name);
    }
    public Sujet findBySujet_id(Long sujet_id) {
        return sujetDao.findBySujet_id(sujet_id);
    }

    public int deleteBySujet_name(String sujet_name) {
        return sujetDao.deleteBySujet_name(sujet_name);
    }

    public int deleteBySujet_id(Long sujet_id) {
        return sujetDao.deleteBySujet_id(sujet_id);
    }

    public Sujet save(Sujet sujet) {
        return sujetDao.save(sujet);
    }

    @Autowired
    private SujetDao sujetDao;
}
