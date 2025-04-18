package com.javanauta.aprendendospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javanauta.aprendendospring.business.EnderecoService;
import com.javanauta.aprendendospring.infrastructure.entiry.Endereco;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

	@Autowired
	public EnderecoService enderecoService;
	
	@GetMapping
	public List<Endereco> listarEnderecos(){
		return enderecoService.listarEnderecos();
	}
	
	@PostMapping
	public ResponseEntity<Endereco> salvarEndereco(@RequestBody Endereco endereco) {
		return ResponseEntity.ok(enderecoService.salvarEndereco(endereco));
	}
}
