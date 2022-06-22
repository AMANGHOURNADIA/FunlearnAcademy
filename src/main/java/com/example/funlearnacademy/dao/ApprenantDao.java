package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantDao extends JpaRepository<Apprenant,Long> {
    Apprenant findByReference(String reference);
    Apprenant findByUsername(String username);
    Apprenant findByEmail(String email);
    int deleteByReference(String reference);

}
