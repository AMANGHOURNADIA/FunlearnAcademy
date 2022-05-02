package com.example.funlearnacademy.bean;

import javax.persistence.Entity;
import java.util.Collection;


@Entity
public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(Long id, String email, String fullname, String password, Collection<Role> roles) {
        super(id, email, fullname, password, roles);
    }

    public Admin(String username, String password) {
        super(username, password);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname= fullname;
    }


}

