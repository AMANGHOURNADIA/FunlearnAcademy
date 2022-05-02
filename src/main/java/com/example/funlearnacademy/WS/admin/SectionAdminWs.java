package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Section;
import com.example.funlearnacademy.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping
public class SectionAdminWs {
    @Autowired
    private SectionService sectionService;
 @GetMapping("/section/{id}")
    public Section findBySection_id(@PathVariable Long section_id) {
        return sectionService.findBySection_id(section_id);
    }
  @GetMapping("/cours/find/{id}")
    public List<Section> findByCoursId(@PathVariable Long id) {
        return sectionService.findByCoursId(id);
    }

    @DeleteMapping("/section/delete/{id}")
    public void deleteBySection_id(@PathVariable Long section_id) {
        sectionService.deleteBySection_id(section_id);
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
