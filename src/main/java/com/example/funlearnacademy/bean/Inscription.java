package com.example.funlearnacademy.bean;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Integer number;
    @ManyToOne
    private Apprenant apprenant;
    @ManyToOne
    private Cours cours;
    private String cardName;
    private String cardNumber;
    private String securityCode;
    private String dateExpiration;
    @JsonFormat( pattern = "yyyy-MM-dd")
    private Date dateInscription;


    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Apprenant getApprenant() {
        return apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }
}
