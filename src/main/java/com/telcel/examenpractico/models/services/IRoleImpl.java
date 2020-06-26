package com.telcel.examenpractico.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telcel.examenpractico.models.dao.IRoleDao;
import com.telcel.examenpractico.models.entity.Role;

@Service
public class IRoleImpl implements IRoleService{

	@Autowired
	private IRoleDao roleDao;
	
	@Override
	public List<Role> findAll() {

		return (List<Role>) roleDao.findAll();
	}

	@Override
	public Role findById(long id) {

		return roleDao.findById(id).orElse(null);
	}

	@Override
	public Role save(Role role) {
		return roleDao.save(role);
	}

	@Override
	public void delete(Long id) {
		roleDao.deleteById(id);
	}

}
