package com.javanauta.aprendendospring.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javanauta.aprendendospring.infrastructure.entiry.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
