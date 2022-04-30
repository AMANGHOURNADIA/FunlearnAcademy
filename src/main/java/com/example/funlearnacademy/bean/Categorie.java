package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Cat_name;
    private String Cat_code;
    private String description;
    @OneToMany
    private List<CategorieItem> categorieItems;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CategorieItem> getCategorieItems() {
        return categorieItems;
    }

    public void setCategorieItems(List<CategorieItem> categorieItems) {
        this.categorieItems = categorieItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long cat_id) {
        this.id = cat_id;
    }
    public String getCat_name() {
        return Cat_name;
    }

    public void setCat_name(String cat_name) {
        this.Cat_name = cat_name;
    }

    public String getCat_code() {
        return Cat_code;
    }

    public void setCat_code(String cat_code) {
        this.Cat_code = cat_code;
    }
}
