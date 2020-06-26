package com.telcel.examenpractico.models.services;

import java.util.List;

import com.telcel.examenpractico.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	public Usuario findById(long id);
	public Usuario save(Usuario usuario);
	public void delete(Long id);
	
	
}
