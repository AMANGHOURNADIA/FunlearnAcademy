package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionDao extends JpaRepository<Inscription, Long> {
    Inscription findByNumber(Integer number);
    Inscription findInscriptionByApprenantId(Long id);
    int deleteByNumber(Integer number);
    int deleteByApprenantReference(String reference);
    int deleteInscriptionByApprenantId(Long id);
    List<Inscription> findInscriptionsByApprenantId(Long id);
    List<Inscription> findByApprenantId(Long id);
    Inscription findInscriptionById(Long id);
    Inscription findInscriptionByApprenantUsername(String username);
    List<Inscription> findAllByOrderByIdDesc();
}
