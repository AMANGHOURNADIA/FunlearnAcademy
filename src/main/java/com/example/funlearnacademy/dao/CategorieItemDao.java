package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.CategorieItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategorieItemDao extends JpaRepository<CategorieItem, Long> {
    List<CategorieItem> findByCategorieId(Long id);
}
