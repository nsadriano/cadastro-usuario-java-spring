package com.adriano.cadastrousuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriano.cadastrousuario.business.UsuarioService;
import com.adriano.cadastrousuario.infrastructure.entity.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	public UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> getAllUsers(){
		return usuarioService.getAllUsers();
	}
	
	@PostMapping
	public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.ok(usuarioService.salvarUsuario(usuario));
	}

}
