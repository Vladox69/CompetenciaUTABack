package com.uta.sgcf.persona;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="persona")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_persona")
	private Integer id_persona;
	
	@Column(name="cedula")
	private String cedula;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="rol")
	private String rol;
	
	@Column(name="disponibilidad")
	private int disponibilidad;
	
	
	public Integer getId() {
		return id_persona;
	}

	public void setId(Integer id) {
		this.id_persona = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}


	public String getDisponibilidad() {
		return rol;
	}

	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Persona(Integer id, String cedula, String nombre, String rol, int disponibilidad) {
		super();
		this.id_persona = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.rol = rol;
		this.disponibilidad = disponibilidad;
		
		
		
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id_persona + ", cedula=" + cedula + ", nombre=" + nombre + ", rol=" + rol +", disponibilidad=" + disponibilidad +  "]";
	}
	

}