package com.example.funlearnacademy.service;


import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.dao.FormateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FormateurService {
    @Autowired
    private FormateurDao formateurDao;

    public Formateur findAll() {
        return formateurDao.findAll();
    }

    public Formateur save(Formateur formateur) {
        return formateurDao.save(formateur);
    }
    public Formateur findByRef(String ref) {
        return formateurDao.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        return formateurDao.deleteByRef(ref);
    }
}
