package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.Question;
import com.example.funlearnacademy.dao.QuestionDao;
import com.example.funlearnacademy.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("admin/question")
public class AdminQuestionWs {
      @Autowired
    private QuestionService questionService;
    @PostMapping("add/{id}")
    public Question addQuestion(@RequestBody Question question, @PathVariable Long id) {
        return questionService.addQuestion(question, id);
    }
   @GetMapping("get/{id}")
    public List<Question> getQuestions(@PathVariable Long id) {
        return questionService.getQuestions(id);
    }
  @PostMapping("/")
    public Question save(@RequestBody Question question) {
        return questionService.save(question);
    }
}
