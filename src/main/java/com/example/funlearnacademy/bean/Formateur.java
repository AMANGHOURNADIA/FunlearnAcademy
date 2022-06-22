package com.example.funlearnacademy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Formateur extends User{
    private String ref;
    private Long  bankaccount ;
    private String grade;
    private String specialite;
    @Column(length = 1000000)
    private String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Long bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
