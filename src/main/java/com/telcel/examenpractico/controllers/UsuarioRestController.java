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
import com.telcel.examenpractico.models.entity.Usuario;
import com.telcel.examenpractico.models.services.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {


	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/listar")
	public List<Usuario> listar() {
		return usuarioService.findAll();

	}
	
	@GetMapping("/listar/{id}")
	public Usuario mostrar(@PathVariable long id) {
      return usuarioService.findById(id);
	}
	
	@PostMapping("/agregar")
	public Usuario crear(@RequestBody Usuario us) {

		return usuarioService.save(us);

	}

	@PutMapping("/actualizar/{id}")

	public Usuario actualizar(@RequestBody Usuario us, @PathVariable Long id) {
		Usuario usuarioActual = usuarioService.findById(id);
		usuarioActual.setNombre(us.getNombre());
		usuarioActual.setApellidoP(us.getApellidoP());
		usuarioActual.setApellidoM(us.getApellidoM());
		return usuarioService.save(us);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		usuarioService.delete(id);
	}

}
