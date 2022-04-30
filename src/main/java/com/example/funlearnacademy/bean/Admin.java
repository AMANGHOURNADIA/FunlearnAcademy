package com.example.funlearnacademy.bean;

import javax.persistence.Entity;


@Entity
public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(User user) {
        super(user.id, user.email, user.password, user.fullname, user.role);
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

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname= fullname;
    }


}

