package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LevelDao extends JpaRepository<Level, Long> {
    Level addLevel(Level levelDto, Long id);

    List<Level> getLevels(Long id);

    Level getLevel(Long id);
}