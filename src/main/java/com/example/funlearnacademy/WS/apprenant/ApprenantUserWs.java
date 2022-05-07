package com.example.funlearnacademy.WS.apprenant;

import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apprenant/user")
public class ApprenantUserWs {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }
    @GetMapping("/email/{email}")
    public User findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }
    @PostMapping("/")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
    @GetMapping("/username/{username}")
    public User findByUsername( @PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/id/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }



    @DeleteMapping("/username/{username}")
    public int deleteByUsername(@PathVariable String username) {
        return userService.deleteByUsername(username);
    }
}
