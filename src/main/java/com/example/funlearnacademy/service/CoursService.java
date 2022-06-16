package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Cours;
import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.bean.Sujet;
import com.example.funlearnacademy.dao.CoursDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
   @Autowired
    private CoursDao coursDao;
   @Autowired
   private FormateurService formateurService;
   @Autowired
   private SujetService sujetService;

    public Optional<Cours> findById(Long id) {
        return coursDao.findById(id);
    }
 @Transactional
    public void deleteById(Long id) {
        coursDao.deleteById(id);
    }

    public List<Cours> findAll() {
        return coursDao.findAll();
    }

    public Cours save(Cours cours) throws Exception {
        // beans wst bean
        Optional<Formateur> formateur = this.formateurService.findById(cours.getFormateur().getId());
        Optional<Sujet> sujet = this.sujetService.findById(cours.getSujet().getId());
        if (formateur.isEmpty()){
            throw new Exception("Formateur not found");
        }
        if (sujet.isEmpty()){
            throw new Exception("Sujet not found");
        }
        cours.setFormateur(formateur.get());
        cours.setSujet(sujet.get());
        return coursDao.save(cours);
    }

    public List<Cours> findByFormateurId(Long id) {
        return coursDao.findByFormateurId(id);
    }
}
