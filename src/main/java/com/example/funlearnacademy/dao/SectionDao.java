package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionDao extends JpaRepository<Section, Long> {
    Section findBySection_name(String section_name);
    Section findBySection_id(Long section_id);
    int deleteBySection_id(Long section_id);
}
