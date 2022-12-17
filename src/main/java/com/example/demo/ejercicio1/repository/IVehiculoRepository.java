package com.example.demo.ejercicio1.repository;

import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
@Service
public interface IVehiculoRepository {
	
	public Vehiculo buscar(String placa);
	 public void insertar(Vehiculo vehiculo);
	 public void actualizar(Vehiculo vehiculo);

	 public void borrar (String placa);
	 

}
