package com.uta.sgcf.proyectos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="*",allowedHeaders = "*")
@RestController
@RequestMapping("/proyecto")

public class ProyectoController {
	@Autowired
	private ProyectoService proyectoService;

	@GetMapping
	public List<Proyecto> getProyectos(){
		return this.proyectoService.getProyecto();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Proyecto>  getClienteById(@PathVariable("id") Integer id) {
		try {
			Proyecto cliente=this.proyectoService.getProyectoById(id);
			return new ResponseEntity<Proyecto>(cliente,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	
	@GetMapping("/ced/{cedula}")
	public ResponseEntity<Proyecto> getClienteByCedula( @PathVariable("cedula") String cedula) {
			Proyecto cliente=this.proyectoService.getClienteByCedula(cedula);
			if(cliente!=null) {				
				return new ResponseEntity<Proyecto>(cliente,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
			}
	}
	*/
	@PostMapping
	public ResponseEntity<?> createProyecto(@RequestBody Proyecto proyecto) {
		try {
			Proyecto c=this.proyectoService.createProyecto(proyecto);
			return new ResponseEntity<Proyecto>(c,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	@PutMapping
	public Proyecto updateProyecto(@RequestBody Proyecto proyecto) {
		return this.proyectoService.updateProyecto(proyecto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>  deleteProyecto(@PathVariable("id") Integer id) {
		this.proyectoService.deleteProyecto(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
