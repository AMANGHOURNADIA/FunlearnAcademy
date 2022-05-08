package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.Section;
import com.example.funlearnacademy.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("apprenant/section")
public class ApprenantSectionWs {
    @Autowired
    private SectionService sectionService;

    @GetMapping("/id/{id}")
    public Section findSectionById(@PathVariable Long id) {
        return sectionService.findSectionById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        sectionService.deleteById(id);
    }

    @GetMapping("/cours/id/{id}")
    public List<Section> findByCoursId(@PathVariable Long id) {
        return sectionService.findByCoursId(id);
    }

    @GetMapping("/")
    public List<Section> findAll() {
        return sectionService.findAll();
    }

    @PostMapping("/")
    public Section save(@RequestBody Section section) {
        return sectionService.save(section);
    }
}
