package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamationDao extends JpaRepository<Reclamation,Long> {
    Reclamation findReclamationById(Long id);
    List<Reclamation> findReclamationByUserId(Long id);
}
