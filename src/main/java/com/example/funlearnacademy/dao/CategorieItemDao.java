package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.CategorieItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieItemDao extends JpaRepository<CategorieItem, Long> {
    CategorieItem findByReference(String reference);
    int deleteByReference(String reference);
    List<CategorieItem> findByCategorieCode(String code);
    int deleteByCategorieCode(String code);
}
