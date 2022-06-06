package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("apprenant/theme")
public class ApprenantThemeWs {
    @Autowired
    private ThemeService themeService;
    @PostMapping("theme")
    public Theme addTheme(@RequestBody Theme theme) {
        return themeService.addTheme(theme);
    }
    @GetMapping("/")
    public List<Theme> getThemes() {
        return themeService.getThemes();
    }
    @GetMapping("/id/{id}")
    public Theme getTheme(@PathVariable Long id) {
        return themeService.getTheme(id);
    }
    @PostMapping("/")
    public Theme save(@RequestBody Theme theme) {
        return themeService.save(theme);
    }
}
