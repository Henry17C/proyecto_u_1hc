package com.example.demo.ejercicio1.repository;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;

public interface IPropietarioRepository {
	 public void insertar(Propietario Prop);

	 public void eliminar (String placa);
	 public Propietario buscar(String cedula);

}
