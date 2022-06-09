package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Long> {
   
}
