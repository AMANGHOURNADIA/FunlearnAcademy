package com.example.funlearnacademy.service;

import com.example.funlearnacademy.bean.History;
import com.example.funlearnacademy.dao.HistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
   @Autowired
   private HistoryDao historyDao;

    public History findHistoryByScore(int score) {
        return historyDao.findHistoryByScore(score);
    }

    public History findHistoryByUsername(String username) {
        return historyDao.findHistoryByUsername(username);
    }

    public History addHistory(History historyDto) {
        return historyDao.save(historyDto);
    }

    public List<History> getHistories() {
        return historyDao.findAll();
    }



    public History save(History history) {
        return historyDao.save(history);
    }
}
