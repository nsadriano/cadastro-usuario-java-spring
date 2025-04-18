package com.javanauta.aprendendospring.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javanauta.aprendendospring.infrastructure.entiry.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
