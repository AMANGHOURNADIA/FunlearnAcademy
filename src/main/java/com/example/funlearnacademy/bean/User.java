package com.example.funlearnacademy.bean;

import javax.persistence.*;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected  Long id ;
    protected  String email;
    protected  String fullname;
    protected  String username;
    protected  String password;
    protected String img;
    @ManyToMany(fetch = EAGER)
    protected Collection<Role> authorities;
    protected String role;
    protected boolean accountNonExpired=true;/*blocker l'acces au compte */
    protected boolean credentialsNonExpired=true;
    protected boolean accountNonLocked=true;
    protected boolean enabled=true;


    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String email, String password, Collection<Role> roles) {
        this.email = email;
        this.password = password;
        this.authorities = roles;
    }

    public User(Long id, String email, String fullname, String password, Collection<Role> roles) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.password = password;
        this.authorities= roles;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Collection<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<Role> authorities) {
        this.authorities = authorities;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}