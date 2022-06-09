package com.example.funlearnacademy.WS.formateur;

import com.example.funlearnacademy.bean.Question;
import com.example.funlearnacademy.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("formateur/question")
public class FormateurQuestionWs {
    @Autowired
    private QuestionService questionService;
    @PostMapping("add/{id}")
    public Question addQuestion(@RequestBody Question question) throws Exception {
        return questionService.save(question);
    }
    @GetMapping("/")
    public List<Question> getQuestions() {
        return questionService.getQuestions();
    }
    @PostMapping("/")
    public Question save(@RequestBody Question question) throws Exception {
        return questionService.save(question);
    }
}
