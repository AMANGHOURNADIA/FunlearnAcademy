package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Reclamation;
import com.example.funlearnacademy.dao.ReclamationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationDao reclamationDao;

    public Reclamation findReclamationById(Long id) {
        return reclamationDao.findReclamationById(id);
    }

    public List<Reclamation> findReclamationByUserId(Long id) {
        return reclamationDao.findReclamationByUserId(id);
    }

    public Reclamation findReclamationByIdAndUserId(Long id) {
        return reclamationDao.findReclamationByIdAndUserId(id);
    }

    public List<Reclamation> findAll() {
        return reclamationDao.findAll();
    }

    public Reclamation save(Reclamation reclamation) {
        return reclamationDao.save(reclamation);
    }

    public void deleteById(Long id) {
        reclamationDao.deleteById(id);
    }
}
