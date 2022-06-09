package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String difficulty;

    @OneToMany
    private List<Question> questions;

    @ManyToOne
    private Cours cours;


    public Level() {
    }

    public Level(String difficulty, List<Question> questions,Cours cours ) {
        this.difficulty = difficulty;
        this.questions = questions;
        this.cours = cours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Cours getCours() {
        return cours;
    }

    public void setTheme(Cours cours) {
        this.cours = cours;
    }
}
