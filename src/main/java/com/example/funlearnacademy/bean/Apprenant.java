package com.example.funlearnacademy.bean;

import javax.persistence.Entity;


@Entity
public class Apprenant extends User{
     private String reference;
     public Apprenant(){
          super();
     }

     public Apprenant(Long id, String email, String fullname, String password, Role role, String reference) {
          super(id, email, fullname, password, role);
          this.reference = reference;
     }

     public String getReference() {
          return reference;
     }

     public void setReference(String reference) {
          this.reference = reference;
     }
}