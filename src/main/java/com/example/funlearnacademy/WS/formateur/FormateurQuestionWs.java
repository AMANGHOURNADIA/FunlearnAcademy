package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Question;
import com.example.funlearnacademy.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("formateur/question")
public class FormateurQuestionWs {
    @Autowired
    private QuestionService questionService;
    @PostMapping("/")
    public Question save(@RequestBody Question question)  {
        return questionService.save(question);
    }
    @PostMapping("/update/")
    public Question update(@RequestBody Question question)  {
        return questionService.save(question);
    }
    @GetMapping("/")
    public List<Question> findAll() {
        return questionService.findAll();
    }
    @GetMapping("/id/{id}")
    public Optional<Question> findById(Long id) {
        return questionService.findById(id);
    }
    @DeleteMapping("/question/")
    public void delete(Long id) {
        questionService.delete(id);
    }
}
