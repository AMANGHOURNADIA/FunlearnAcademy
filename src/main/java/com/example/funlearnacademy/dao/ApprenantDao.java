package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantDao extends JpaRepository<Apprenant,String> {
    Apprenant findByReference(String reference);
    int deleteByReference(String reference);

}
