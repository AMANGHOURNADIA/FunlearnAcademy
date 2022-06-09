package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/quiz")
public class AdminQuizWs {
    @Autowired
    private QuizService quizService;
}
