package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.Formateur;
import com.example.funlearnacademy.bean.Level;
import com.example.funlearnacademy.bean.Question;
import com.example.funlearnacademy.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
  @Autowired
    private QuestionDao questionDao;


    public Question save(Question question)  {
        return questionDao.save(question);
    }
    public Question update(Question question)  {
        return questionDao.save(question);
    }

    public List<Question> findAll() {
        return questionDao.findAll();
    }

    public Optional<Question> findById(Long id) {
        return questionDao.findById(id);
    }
  @Transactional
    public void delete(Long id) {
        questionDao.deleteById(id);
    }
}
