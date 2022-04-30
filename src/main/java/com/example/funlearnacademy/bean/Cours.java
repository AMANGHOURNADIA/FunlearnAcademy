package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long coursId;
    private String coursName;
    private String description;
    private Double prix;
    @ManyToOne
    private Formateur formateur;
    @OneToMany
    private List<Section> sections;

    public Cours() {
    }


    public Cours(Long coursId, String coursName, String description, Double prix, List<Section> sections) {
        this.coursId = coursId;
        this.coursName = coursName;
        this.description = description;
        this.prix = prix;
        this.sections = sections;
    }

    public Long getCoursId() {
        return coursId;
    }

    public void setCoursId(Long coursId) {
        this.coursId = coursId;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
