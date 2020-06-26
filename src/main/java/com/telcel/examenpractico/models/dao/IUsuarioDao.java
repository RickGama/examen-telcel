package com.telcel.examenpractico.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.telcel.examenpractico.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	//List<Usuario> findByUsuarioId(long usuarioId);
	//List<Usuario> findByRoleId(long roleId);
}
