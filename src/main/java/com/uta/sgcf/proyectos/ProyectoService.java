package com.uta.sgcf.proyectos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uta.sgcf.persona.Persona;
import com.uta.sgcf.persona.PersonaRepository;



@Service
public class ProyectoService {
	@Autowired
	private ProyectoRepository proyectoRepository;
	
	
	
	public List<Proyecto> getProyecto(){
		return this.proyectoRepository.findAll();
	}
	
	public Proyecto getProyectoById(Integer id) {
		return this.proyectoRepository.findById(id).get();
	}
	
	/*
	public Persona getPersonaByCedula(String cedula) {
		return this.proyectoRepository.findByCedula(cedula);
	}
	*/
	
	public Proyecto createProyecto(Proyecto proyecto) {
		return this.proyectoRepository.save(proyecto);
	}
	
	public Proyecto updateProyecto(Proyecto proyecto) {
		return this.proyectoRepository.save(proyecto);
	}
	
	public void deleteProyecto(Integer id) {
		this.proyectoRepository.deleteById(id);
	}
}
