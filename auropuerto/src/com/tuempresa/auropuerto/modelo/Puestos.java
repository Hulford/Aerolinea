package com.tuempresa.auropuerto.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Puestos extends Identificable{

	 
	
	@Column(length=20)
	@Required
	String descripcion;
	
	@OneToMany(mappedBy="puestos")
	@ListProperties("id, nombre")
	Collection<Empleado> empleado;
}
