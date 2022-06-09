package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.bean.Level;
import com.example.funlearnacademy.dao.LevelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.context.Theme;

import java.util.List;
import java.util.Optional;

@Service
public class LevelService {
     @Autowired
       private LevelDao levelDao;

    public Level addLevel(Level level) {
        return levelDao.save(level);
    }

    public List<Level> getLevels(Long id) {
        return levelDao.findAll();
    }
    public Optional<Level> findById(Long aLong) {
        return levelDao.findById(aLong);
    }

    public Level getLevel(Long id) {
        return levelDao.findLevelById(id);
    }

    public  Level save(Level level) {
        return levelDao.save(level);
    }
}
