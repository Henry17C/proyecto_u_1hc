package com.example.demo.ejercicio1.service;

import com.example.demo.ejercicio1.modelo.Propietario;

public interface IPropietarioService {
	
	public void grardar(Propietario propietario);
	public void eliminar (String cedula);
}
