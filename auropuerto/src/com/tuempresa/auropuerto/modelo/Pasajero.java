package com.tuempresa.auropuerto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero extends Identificable{

	
	
	@Column (length=20)
	@Required
	String id;
	
	@Column (length=50)
	@Required
	String nombre;
	
	
	@Embedded @NoFrame
    Direccion direccion;
}
