package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Cours;
import com.example.funlearnacademy.bean.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SujetDao extends JpaRepository<Sujet, Long> {
    Sujet findBySujet_id(Long sujet_id);
    List<Sujet> findsBySujet_name(String sujet_name);
    int deleteBySujet_id(Long sujet_id);
    int deleteBySujet_name(String sujet_name);
}
