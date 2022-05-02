package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Chapitre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapitreDao  extends JpaRepository<Chapitre, Long> {
    List<Chapitre> findBySectionSection_idOrderByNumeroOrder(Long id);
    List<Chapitre> findBySectionSection_id(Long id);
    void deleteById(Long id);

}
