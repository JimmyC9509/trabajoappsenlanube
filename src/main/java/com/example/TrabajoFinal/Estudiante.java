package com.example.TrabajoFinal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Estudiante {

	int id;
	String nombre;
	String apellido;
	String materia;
	double calificacion;
}
