package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sujet_id;
    private String sujet_name;
    @ManyToOne
    private CategorieItem categorieItem;
    @ManyToOne
    private List<Cours> cours;

    public CategorieItem getCategorieItem() {
        return categorieItem;
    }

    public void setCategorieItem(CategorieItem categorieItem) {
        this.categorieItem = categorieItem;
    }

    public Long getSujet_id() {
        return sujet_id;
    }

    public void setSujet_id(Long sujet_id) {
        this.sujet_id = sujet_id;
    }

    public String getSujet_name() {
        return sujet_name;
    }

    public void setSujet_name(String sujet_name) {
        this.sujet_name = sujet_name;
    }
}
