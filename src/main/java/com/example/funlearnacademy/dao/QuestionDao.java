package com.example.funlearnacademy.dao;


import com.example.funlearnacademy.bean.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {
    Question addQuestion(Question question, Long id);

    List<Question> getQuestions(Long idLevel);
}
