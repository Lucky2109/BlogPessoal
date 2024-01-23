package com.generation.blog02.model;



import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_postagens")
public class Postagem {

	@Id	//tornar esse atributo uma chave primaria do banco de dados
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//adicionar Id como auto increment
	private Long id;
	
	//essa anotação valida o atributo tendo um valor maximo e minimo de caracteres
	@Size(min=5, max = 100, message = "O título deve ter no minimo 5 caracteres e no maximo 100! ")
	@NotBlank(message = "Atributo titulo é obrigatorio")
	private String titulo;
	
	@Size(min=10, max = 1000, message = "O título deve ter no minimo 10 caracteres e no maximo 1000! ")
	@NotBlank(message = "Atributo titulo é obrigatorio")
	private String texto;
	
	@UpdateTimestamp //pega a data do sistema ao cadastrar um registro
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
}

