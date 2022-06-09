package com.example.funlearnacademy.service;

import com.example.funlearnacademy.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
    private QuizDao quizDao;
}
