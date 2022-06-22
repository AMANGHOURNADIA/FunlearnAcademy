package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Apprenant;
import com.example.funlearnacademy.bean.Cours;
import com.example.funlearnacademy.bean.Inscription;
import com.example.funlearnacademy.dao.InscriptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {
    @Autowired
    private InscriptionDao inscriptionDao;
    @Autowired
    private ApprenantService apprenantService;
    @Autowired
    private CoursService coursService;



    public Inscription findByNumber(Integer number) {
        return inscriptionDao.findByNumber(number);
    }

    public Inscription findInscriptionByApprenantId(Long id) {
        return inscriptionDao.findInscriptionByApprenantId(id);
    }

    public int deleteByNumber(Integer number) {
        return inscriptionDao.deleteByNumber(number);
    }
  @Transactional
    public int deleteByApprenantReference(String reference) {
        return inscriptionDao.deleteByApprenantReference(reference);
    }
 @Transactional
    public void deleteById(Long id) {
        inscriptionDao.deleteById(id);
    }
  @Transactional
    public int deleteInscriptionByApprenantId(Long id) {
        return inscriptionDao.deleteInscriptionByApprenantId(id);
    }

    public List<Inscription> findInscriptionsByApprenantId(Long id) {
        return inscriptionDao.findInscriptionsByApprenantId(id);
    }

    public Inscription findInscriptionById(Long id) {
        return inscriptionDao.findInscriptionById(id);
    }

    public Inscription findInscriptionByApprenantUsername(String username) {
        return inscriptionDao.findInscriptionByApprenantUsername(username);
    }

    public List<Inscription> findAllByOrderByIdDesc() {
        return inscriptionDao.findAllByOrderByIdDesc();
    }

    public List<Inscription> findAll() {
        return inscriptionDao.findAll();
    }

    public Inscription save(Inscription entity) throws Exception {
        Optional<Apprenant> apprenant = this.apprenantService.findById(entity.getApprenant().getId());
        Optional<Cours> cours = this.coursService.findById(entity.getCours().getId());
        if (apprenant.isEmpty()){
            throw new Exception("Account not found !");
        }
        if (cours.isEmpty()){
            throw new Exception("Course not found !");
        }
        entity.setApprenant(apprenant.get());
        entity.setCours(cours.get());
        return inscriptionDao.save(entity);
    }

    public List<Inscription> findByApprenantId(Long id) {
        return inscriptionDao.findByApprenantId(id);
    }
}
