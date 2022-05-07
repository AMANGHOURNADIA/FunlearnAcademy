package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurDao extends JpaRepository<Formateur,Long> {
    Formateur findByRef(String ref);
    int deleteByRef(String ref);

}
