package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Apprenant;
import com.example.funlearnacademy.dao.ApprenantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ApprenantService {
    @Autowired
    private ApprenantDao apprenantDao;

    public Apprenant findByReference(String reference) {
        return apprenantDao.findByReference(reference);
    }
    @Transactional
    public int deleteByReference(String reference) {
        return apprenantDao.deleteByReference(reference);
    }

    public List<Apprenant> findAll() {
        return apprenantDao.findAll();
    }

    public Apprenant save(Apprenant apprenant) {
        return apprenantDao.save(apprenant);
    }
}
