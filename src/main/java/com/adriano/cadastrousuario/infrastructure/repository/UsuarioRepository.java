package com.adriano.cadastrousuario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriano.cadastrousuario.infrastructure.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	boolean existsByEmail(String email);
	
}
