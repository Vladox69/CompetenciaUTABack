package com.uta.sgcf.proyectos_personas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="proyecto_personas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class proyecto_personas {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_proyecto_persona")
	private Integer id_proyecto_persona;
	

	
	@Column(name="id_persona")
	private Integer id_persona;
	
	
	@Column(name="id_proyecto")
	private Integer id_proyecto;
	

	public proyecto_personas(Integer id_proyecto_persona, Integer id_persona, Integer id_proyecto) {
		super();
		this.id_proyecto_persona = id_proyecto_persona;
		this.id_persona = id_persona;
		this.id_proyecto = id_proyecto;
	}




	public proyecto_personas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "proyecto_personas [id=" + id_proyecto_persona + ", id_persona=" + id_persona + ", id_proyecto=" + id_proyecto  +"]";
	}
	


	
}
