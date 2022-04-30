package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoursDao extends JpaRepository<Cours, Long> {
    Optional<Cours> findById(Long id);
    void deleteById(Long id);
}
