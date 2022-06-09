package com.example.funlearnacademy.bean;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;

@Entity
public class User implements UserDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected  Long id ;
    protected  String email;
    protected  String fullname;
    protected  String username;
    protected  String password;
    protected  String phone;
    @ManyToMany(fetch = EAGER)
    protected Collection<Role> authorities;
    protected String role;
    protected boolean accountNonExpired=true;/*blocker l'acces au compte */
    protected boolean credentialsNonExpired=true;
    protected boolean accountNonLocked=true;
    protected boolean enabled=true;
    protected String image;
    protected String token;

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
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}