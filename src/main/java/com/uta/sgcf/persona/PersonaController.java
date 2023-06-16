package com.uta.sgcf.persona;


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
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping
	public List<Persona> getPersonas(){
		return this.personaService.getPersona();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona>  getPersonaById(@PathVariable("id") Integer id) {
		try {
			Persona persona=this.personaService.getPersonaById(id);
			return new ResponseEntity<Persona>(persona,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/ced/{cedula}")
	public ResponseEntity<Persona> getPersonaByCedula( @PathVariable("cedula") String cedula) {
			Persona persona=this.personaService.getPersonaByCedula(cedula);
			if(persona!=null) {				
				return new ResponseEntity<Persona>(persona,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
			}
	}
	
	@PostMapping
	public ResponseEntity<?> createPersona(@RequestBody Persona persona) {
		try {
			Persona c=this.personaService.createPersona(persona);
			return new ResponseEntity<Persona>(c,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	@PutMapping
	public Persona updatePersona(@RequestBody Persona persona) {
		return this.personaService.updatePersona(persona);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>  deletePersona(@PathVariable("id") Integer id) {
		this.personaService.deletePersona(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	
	
	
}
