package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado {

	@Id
	@Hidden
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(length=32)
	String oid;
	
	@Column(length=32)
	@Required
	int id;
	
	@Column(length=32)
	@Required
	String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	@DescriptionsList
	Puestos puestos;
	
	
}
