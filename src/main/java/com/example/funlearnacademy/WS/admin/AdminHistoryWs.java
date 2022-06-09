package com.example.funlearnacademy.WS.admin;

import com.example.funlearnacademy.bean.History;
import com.example.funlearnacademy.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("admin/history")
public class AdminHistoryWs {
    @Autowired
    private HistoryService historyService;
  @GetMapping("/score/{score}")
    public History findHistoryByScore(@PathVariable int score) {
        return historyService.findHistoryByScore(score);
    }
    @GetMapping("/username/{username}")
    public History findHistoryByUsername(@PathVariable String username) {
        return historyService.findHistoryByUsername(username);
    }
   @PostMapping("addhistory")
    public History addHistory(@RequestBody History history) {
        return historyService.addHistory(history);
    }
  @GetMapping("/")
    public List<History> getHistories() {
        return historyService.getHistories();
    }
    @PostMapping("/")
    public History save(@RequestBody History history) {
        return historyService.save(history);
    }
}
