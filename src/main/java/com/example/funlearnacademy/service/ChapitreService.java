package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Chapitre;
import com.example.funlearnacademy.dao.ChapitreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChapitreService {
    @Autowired
    private ChapitreDao chapitreDao;

    public List<Chapitre> findBySectionSection_idOrderByNumeroOrder(Long id) {
        return chapitreDao.findBySectionSection_idOrderByNumeroOrder(id);
    }

    public List<Chapitre> findBySectionSection_id(Long id) {
        return chapitreDao.findBySectionSection_id(id);
    }
  @Transactional
    public void deleteById(Long id) {
        chapitreDao.deleteById(id);
    }

    public List<Chapitre> findAll() {
        return chapitreDao.findAll();
    }

    public Chapitre save(Chapitre chapitre) {
        return chapitreDao.save(chapitre);
    }
}
