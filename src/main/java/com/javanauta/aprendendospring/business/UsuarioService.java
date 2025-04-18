package com.javanauta.aprendendospring.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javanauta.aprendendospring.infrastructure.entiry.Usuario;
import com.javanauta.aprendendospring.infrastructure.exceptions.ConflictException;
import com.javanauta.aprendendospring.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	public UsuarioRepository usuarioRepository;
	
	public Usuario salvarUsuario(Usuario usuario) {
		try {
			emailExiste(usuario.getEmail());
			return usuarioRepository.save(usuario);
		}catch(ConflictException e) {
			throw new ConflictException("Email já cadastrado", e.getCause());
		}
	}
	
	public void emailExiste(String email) {
		try {
			boolean existe = verificaEmailExistente(email);
			if(existe) {
				throw new ConflictException("Email já cadastrado " + email);
			}
		}catch(ConflictException e){
			throw new ConflictException("Email já cadastrado", e.getCause());
		}
	}
	
	public boolean verificaEmailExistente(String email) {
		return usuarioRepository.existsByEmail(email);
	}
	
	public List<Usuario> getAllUsers(){
		return usuarioRepository.findAll();
	}

}
