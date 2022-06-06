package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Level;
import com.example.funlearnacademy.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("formateur/level")
public class FormateurLevelWs {
    @Autowired
    private LevelService levelService;
    @PostMapping("/leve/{id}")
    public Level addLevel(@RequestBody Level level, @PathVariable Long id) {
        return levelService.addLevel(level, id);
    }
    @GetMapping("/id/{id}")
    public List<Level> getLevels(@PathVariable Long id) {
        return levelService.getLevels(id);
    }
    @GetMapping("/getLevel/{id}")
    public Level getLevel(@PathVariable Long id) {
        return levelService.getLevel(id);
    }
    @PostMapping("/")
    public Level save(@RequestBody Level level) {
        return levelService.save(level);
    }
}
