package com.generation.blog02.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blog02.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Optional<Usuario> findByUsuario(String Usuario);

}
