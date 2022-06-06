package com.example.funlearnacademy.service;

import com.example.funlearnacademy.dao.ThemeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.context.Theme;

import java.util.List;

@Service
public class ThemeService {
  @Autowired
    private ThemeDao themeDao;

    public Theme addTheme(Theme theme) {
        return themeDao.addTheme(theme);
    }

    public List<Theme> getThemes() {
        return themeDao.getThemes();
    }

    public Theme getTheme(Long id) {
        return themeDao.getTheme(id);
    }

    public  Theme save(Theme theme) {
        return themeDao.save(theme);
    }
}
