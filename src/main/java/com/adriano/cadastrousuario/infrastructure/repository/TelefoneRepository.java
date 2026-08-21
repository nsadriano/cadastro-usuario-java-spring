package com.adriano.cadastrousuario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriano.cadastrousuario.infrastructure.entity.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
