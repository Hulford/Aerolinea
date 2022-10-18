package com.tuempresa.auropuerto.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinea extends Identificable {
 
	
	@Column(length=12)
	@Required
	int id;
	
	@Column(length=20)
	@Required
	String descripcion;
	
	@OneToMany(mappedBy="aerolinea")
	@ListProperties("id, nombre")
	Collection<Empleado> empleado;
	
}
