package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategorieDao extends JpaRepository<Categorie, Long> {
    Optional<Categorie> findById(Long id);

    Categorie findByName(String name);

    void deleteByCode(String code);


}
