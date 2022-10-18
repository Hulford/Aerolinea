package com.tuempresa.aeropuerto.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo {
@Id

@Column(length=12)
String id;

@Column(length=50)
@Required
String origen;

@Column(length=50)
@Required
String destino;

@Column(length=8)
@Required
String hora;

@Required
@DefaultValueCalculator(CurrentLocalDateCalculator.class)
LocalDate fecha;

@ManyToOne
(fetch=FetchType.LAZY,optional=true)
Pasajero pasajero;
}
