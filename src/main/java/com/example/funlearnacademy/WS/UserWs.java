package com.example.funlearnacademy.WS;

import com.example.funlearnacademy.bean.User;
import com.example.funlearnacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserWs {
    @Autowired
    protected UserService userService;
  @PostMapping("/")
    public int register(@RequestBody User user) {
        return userService.register(user);
    }
   @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

  @GetMapping("/login/{login}")
    public User findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }
  @GetMapping("/role/{role}")
    public List<User> findByRole(@PathVariable String role) {
        return userService.findByRole(role);
    }
  @DeleteMapping("/delte/{delete}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
