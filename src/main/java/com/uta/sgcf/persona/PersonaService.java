package com.uta.sgcf.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	
	
	public List<Persona> getPersona(){
		return this.personaRepository.findAll();
	}
	
	public Persona getPersonaById(Integer id) {
		return this.personaRepository.findById(id).get();
	}
	
	public Persona getPersonaByCedula(String cedula) {
		return this.personaRepository.findByCedula(cedula);
	}
	
	public Persona createPersona(Persona persona) {
		return this.personaRepository.save(persona);
	}
	
	public Persona updatePersona(Persona persona) {
		return this.personaRepository.save(persona);
	}
	
	public void deletePersona(Integer id) {
		this.personaRepository.deleteById(id);
	}

	

}
