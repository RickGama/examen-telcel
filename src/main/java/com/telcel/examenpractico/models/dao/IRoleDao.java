package com.telcel.examenpractico.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.telcel.examenpractico.models.entity.Role;

public interface IRoleDao extends CrudRepository<Role, Long>{
	
	//Role findByUsuarios(Long usuarioId);

}
