package com.example.funlearnacademy.bean;

import javax.persistence.*;


@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String section_name;
    @ManyToOne
    private Cours cours;

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long section_id) {
        this.id = section_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }
}
