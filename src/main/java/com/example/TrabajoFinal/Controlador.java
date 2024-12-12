package com.example.TrabajoFinal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	
	List<Estudiante> est = new ArrayList<Estudiante>();
	int contador = 0;
	
	@GetMapping("/estudiante/{nom}/{ape}/{mat}/{cal}")
	public void ingresoDatos(@PathVariable String nom, 
			@PathVariable String ape,
			@PathVariable String mat,
			@PathVariable double cal) {
		Estudiante e = new Estudiante();
		e.setId(++contador);
		e.setNombre(nom);
		e.setApellido(ape);
		e.setMateria(mat);
		e.setCalificacion(cal);
		est.add(e);
		
	}
	
	@GetMapping("/mostrarestudiante/{id}")
	public Estudiante mostrarDatos(@PathVariable int id) {
		for (Estudiante e : est) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
		
	}

}
