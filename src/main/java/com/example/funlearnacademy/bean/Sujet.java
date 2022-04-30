package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private CategorieItem categorieItem;
    @OneToMany
    private List<Cours> cours;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategorieItem getCategorieItem() {
        return categorieItem;
    }

    public void setCategorieItem(CategorieItem categorieItem) {
        this.categorieItem = categorieItem;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }
}
