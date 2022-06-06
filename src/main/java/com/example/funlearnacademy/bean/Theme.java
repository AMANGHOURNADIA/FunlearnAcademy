package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<Level> levels;

    public Theme(String name) {
        this.name = name;
    }


    public Theme() {
    }

    public Theme(String name, List<Level> levels) {
        this.name = name;
        this.levels = levels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }
}
