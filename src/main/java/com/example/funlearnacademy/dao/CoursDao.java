package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursDao extends JpaRepository<Cours, Long> {
    List<Cours> findByCoursName(String coursName);
    Cours findByCoursId(Long coursId);
    int deleteByCoursId(Long coursId);
    int deleteByCoursName(String coursName);
}
