package com.telcel.examenpractico.models.services;

import java.util.List;

import com.telcel.examenpractico.models.entity.Role;

public interface IRoleService {

	public List<Role> findAll();
	public Role findById(long id);
	public Role save(Role role);
	public void delete(Long id);
	
}
