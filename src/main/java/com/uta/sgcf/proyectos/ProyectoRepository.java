package com.uta.sgcf.proyectos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository

public class ProyectoRepository  extends JpaRepository<Proyecto, Integer> {
	Proyecto findByCedula(String proyecto);

	public Proyecto save(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

