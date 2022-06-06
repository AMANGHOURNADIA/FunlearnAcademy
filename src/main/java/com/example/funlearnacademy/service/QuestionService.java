package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Level;
import com.example.funlearnacademy.bean.Question;
import com.example.funlearnacademy.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
  @Autowired
    private QuestionDao questionDao;

    public Question addQuestion(Question question, Long id) {
        return questionDao.addQuestion(question, id);
    }

    public List<Question> getQuestions(Long idLevel) {
        return questionDao.getQuestions(idLevel);
    }

    public Question save(Question question) {
        return questionDao.save(question);
    }
}
