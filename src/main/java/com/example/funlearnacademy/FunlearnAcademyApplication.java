package com.example.funlearnacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

import static com.example.funlearnacademy.filter.JwtConstant.USER_FOLDER;

@SpringBootApplication
public class FunlearnAcademyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunlearnAcademyApplication.class, args);
        new File(USER_FOLDER).mkdirs();
    }

}
