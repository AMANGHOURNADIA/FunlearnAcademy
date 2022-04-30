package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Cours;
import com.example.funlearnacademy.bean.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SujetDao extends JpaRepository<Sujet, Long> {
    Sujet findByid(Long id);

    void deleteById(Long id);

}
