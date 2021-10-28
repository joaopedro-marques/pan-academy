package com.ivan.app1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivan.app1.model.Usuario;
import com.ivan.app1.repo.UsuarioRepo;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepo usuarioRepo;
	
	public List<Usuario> getAll() {
		return usuarioRepo.findAll();
	}
	
	public Optional<Usuario> getById(long id) {
		return usuarioRepo.findById(id);
	}
}
