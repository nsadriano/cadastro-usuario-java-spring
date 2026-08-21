package com.adriano.cadastrousuario.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriano.cadastrousuario.infrastructure.entity.Endereco;
import com.adriano.cadastrousuario.infrastructure.exceptions.ConflictException;
import com.adriano.cadastrousuario.infrastructure.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	public EnderecoRepository enderecoRepository;
	
	public List<Endereco> listarEnderecos(){
		return enderecoRepository.findAll();
	}
	
	public Endereco salvarEndereco(Endereco endereco) {
		try {
			checaEstado(endereco);
			return enderecoRepository.save(endereco);
		}catch(ConflictException e) {
			throw new ConflictException("O campo estado não pode ter mais que dois caracteres!", e.getCause());
		}		
	}
	
	public void checaEstado(Endereco endereco) {
		try {
			if (endereco.getEstado() == null || endereco.getEstado().length() != 2) {
				throw new ConflictException("O campo estado não pode ter mais que dois caracteres!");
			}
		}catch(ConflictException e) {
			throw new ConflictException("O campo estado não pode ter mais que dois caracteres!", e.getCause());
		}				
		
	}

}
