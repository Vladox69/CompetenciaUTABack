package com.uta.sgcf.proyectos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="proyecto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_proyecto")
	private Integer id_proyecto;
	

	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fecha_inicio")
	private String fecha_inicio;

	@Column(name="fecha_fin")
	private String fecha_fin;
	
	@Column(name="id_persona")
	private int id_persona;
	
	
	public Integer getId() {
		return id_proyecto;
	}

	public void setId(Integer id) {
		this.id_proyecto = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	
	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}


	public Proyecto(Integer id, String nombre, String descripcion, String fecha_inicio, String fecha_fin, int id_persona) {
		super();
		this.id_proyecto = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_inicio = fecha_inicio ;
		this.fecha_fin = fecha_fin ;
		this.id_persona = id_persona; 
		
		
	}

	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Proyecto [id=" + id_proyecto + ", nombre=" + nombre + ", descripcion=" + descripcion +", fecha_inicio=" + fecha_inicio +", fecha_=" + fecha_fin  +", id_persona=" + id_persona +"]";
	}
	


}