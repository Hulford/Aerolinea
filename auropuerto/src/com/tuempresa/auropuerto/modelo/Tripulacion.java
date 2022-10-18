package com.tuempresa.auropuerto.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Tripulacion extends Identificable{
	 
	
	@Column(length=12)
	int id;
	
	@Column(length=50)
	String nombreTripulacion;

	@OneToMany(mappedBy="tripulacion")
	@ListProperties("id, nombre")
	Collection<Empleado> empleado;
}
