package com.javanauta.aprendendospring.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javanauta.aprendendospring.infrastructure.entiry.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	boolean existsByEmail(String email);
	
}
