package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionDao extends JpaRepository<Section, Long> {
   Section findSectionById(Long id);
   List<Section> findByCoursId(Long id);
   void deleteById(Long id);
}
