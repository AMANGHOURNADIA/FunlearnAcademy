package com.example.funlearnacademy.bean;

import javax.persistence.*;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Cat_id;
    private String Cat_name;
    private String Cat_code;

    public Long getCat_id() {
        return Cat_id;
    }

    public void setCat_id(Long cat_id) {
        Cat_id = cat_id;
    }

    public String getCat_name() {
        return Cat_name;
    }

    public void setCat_name(String cat_name) {
        Cat_name = cat_name;
    }

    public String getCat_code() {
        return Cat_code;
    }

    public void setCat_code(String cat_code) {
        Cat_code = cat_code;
    }
}
