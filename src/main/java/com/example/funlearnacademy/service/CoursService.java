package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Cours;
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

    public Cours save(Cours cours) {
        return coursDao.save(cours);
    }
}
