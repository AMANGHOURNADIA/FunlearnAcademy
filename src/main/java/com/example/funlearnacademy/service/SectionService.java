package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Section;
import com.example.funlearnacademy.dao.SectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SectionService {
   @Autowired
    private SectionDao sectionDao;

    public Section findSectionById(Long id) {
        return sectionDao.findSectionById(id);
    }
    @Transactional
    public void deleteById(Long id) {
        sectionDao.deleteById(id);
    }

    public List<Section> findByCoursId(Long id) {
        return sectionDao.findByCoursId(id);
    }

    public  List<Section> findAll() {
        return sectionDao.findAll();
    }

    public Section save(Section section) {
        return sectionDao.save(section);
    }
}
