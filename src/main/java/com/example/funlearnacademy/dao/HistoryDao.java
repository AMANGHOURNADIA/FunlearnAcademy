package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryDao extends JpaRepository<History, Long> {
    History findHistoryByScore(int score);
    History findHistoryByUsername(String username);

}