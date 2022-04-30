package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Formateur;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurDao {
    Formateur findByRef(String ref);
    int deleteByRef(String ref);
   Formateur findAll();
    Formateur save(Formateur formateur);
}
