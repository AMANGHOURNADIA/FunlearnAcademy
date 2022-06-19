package com.example.funlearnacademy.dao;


import com.example.funlearnacademy.bean.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {

 void deleteById(Long id);

}
