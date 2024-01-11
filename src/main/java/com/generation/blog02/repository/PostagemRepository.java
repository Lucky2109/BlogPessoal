package com.generation.blog02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blog02.model.Postagem;
//JPA da o poder da repository comunicar-se com o banco de dados
public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}
