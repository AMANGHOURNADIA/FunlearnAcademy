package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.bean.Level;
import com.example.funlearnacademy.bean.Question;
import com.example.funlearnacademy.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
  @Autowired
    private QuestionDao questionDao;
  @Autowired
  private LevelService levelService;

    public Question addQuestion(Question question) {
        return questionDao.save(question);
    }

    public List<Question> getQuestions() {
        return questionDao.findAll();
    }

    public Question save(Question question) throws Exception {
        Optional<Level> level = this.levelService.findById(question.getLevel().getId());
        if (level.isEmpty()){
            throw new Exception("Level not found");
        }
        question.setLevel(level.get());
        return questionDao.save(question);
    }
}
