package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionDao extends JpaRepository<Section, Long> {
   Section findBySection_id(Long section_id);
   void deleteBySection_id(Long section_id);
}
