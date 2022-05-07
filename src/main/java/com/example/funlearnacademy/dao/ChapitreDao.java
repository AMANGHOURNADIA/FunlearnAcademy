package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Chapitre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapitreDao  extends JpaRepository<Chapitre, Long> {
    List<Chapitre> findBySectionIdOrderByNumeroOrder(Long id);
    List<Chapitre> findBySectionId(Long id);
    void deleteById(Long id);

}
