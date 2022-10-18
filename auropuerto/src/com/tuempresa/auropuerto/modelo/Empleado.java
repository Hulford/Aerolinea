package com.tuempresa.auropuerto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado extends Identificable {

	 
	
	@Column(length=12)
	@Required
	int id;
	
	@Column(length=40)
	@Required
	String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@DescriptionsList
	Puestos puestos;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@DescriptionsList
	Aerolinea aerolinea;
	
	@ManyToOne
	Tripulacion tripulacion;
	
}
