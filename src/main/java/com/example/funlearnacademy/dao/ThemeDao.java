package com.example.funlearnacademy.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.context.Theme;

import java.util.List;

@Repository
public interface ThemeDao extends JpaRepository<Theme, Long> {
    Theme addTheme(Theme theme);

    List<Theme> getThemes();

    Theme getTheme(Long id);
}