package com.example.funlearnacademy.dao;

import com.example.funlearnacademy.bean.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaiireDao extends JpaRepository<Commentaire,Long> {

}
