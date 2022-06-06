package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Level;
import com.example.funlearnacademy.dao.LevelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.context.Theme;

import java.util.List;

@Service
public class LevelService {
     @Autowired
       private LevelDao levelDao;

    public Level addLevel(Level levelDto, Long id) {
        return levelDao.addLevel(levelDto, id);
    }

    public List<Level> getLevels(Long id) {
        return levelDao.getLevels(id);
    }

    public Level getLevel(Long id) {
        return levelDao.getLevel(id);
    }

    public  Level save(Level level) {
        return levelDao.save(level);
    }
}
