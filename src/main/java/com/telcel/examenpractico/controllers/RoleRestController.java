package com.telcel.examenpractico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telcel.examenpractico.models.entity.Role;
import com.telcel.examenpractico.models.services.IRoleService;

@RestController
@RequestMapping("/role")
public class RoleRestController {

	@Autowired
	private IRoleService roleService;

	@GetMapping("/listar")
	public List<Role> listar() {
		return roleService.findAll();

	}

	@GetMapping("/listar/{id}")
	public Role mostrar(@PathVariable long id) {
		return roleService.findById(id);
	}

	@PostMapping("/agregar")
	public Role crear(@RequestBody Role role) {

		return roleService.save(role);

	}

	@PutMapping("/actualizar/{id}")

	public Role actualizar(@RequestBody Role ro, @PathVariable Long id) {
		Role roleActual = roleService.findById(id);
		roleActual.setNombre(ro.getNombre());

		return roleService.save(ro);

	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		roleService.delete(id);
	}

}
