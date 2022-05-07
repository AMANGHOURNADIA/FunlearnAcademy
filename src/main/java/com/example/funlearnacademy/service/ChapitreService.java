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

    public List<Chapitre> findBySectionIdOrderByNumeroOrder(Long id) {
        return chapitreDao.findBySectionIdOrderByNumeroOrder(id);
    }

    public List<Chapitre> findBySectionId(Long id) {
        return chapitreDao.findBySectionId(id);
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
