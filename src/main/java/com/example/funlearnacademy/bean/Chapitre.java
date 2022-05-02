package com.example.funlearnacademy.bean;

import javax.persistence.*;

@Entity
public class Chapitre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String libelle;
    private String urlImage;
    private String urlImage2;
    private String urlImage3;
    private String urlVideo;
    @Column(length = 1000000)
    private String contenu;
    private Integer numeroOrder;/* num dyal chapitre*/
    @ManyToOne
    private Section section;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage2() {
        return urlImage2;
    }

    public void setUrlImage2(String urlImage2) {
        this.urlImage2 = urlImage2;
    }

    public String getUrlImage3() {
        return urlImage3;
    }

    public void setUrlImage3(String urlImage3) {
        this.urlImage3 = urlImage3;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Integer getNumeroOrder() {
        return numeroOrder;
    }

    public void setNumeroOrder(Integer numeroOrder) {
        this.numeroOrder = numeroOrder;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
