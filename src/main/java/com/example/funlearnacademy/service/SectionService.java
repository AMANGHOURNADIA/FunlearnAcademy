package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Section;
import com.example.funlearnacademy.dao.SectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SectionService {
    @Autowired
    private SectionDao sectionDao;

    public Section findBySection_id(Long section_id) {
        return sectionDao.findBySection_id(section_id);
    }
   @Transactional
    public void deleteBySection_id(Long section_id) {
        sectionDao.deleteBySection_id(section_id);
    }

    public List<Section> findAll() {
        return sectionDao.findAll();
    }

    public Section save(Section section) {
        return sectionDao.save(section);
    }
}
