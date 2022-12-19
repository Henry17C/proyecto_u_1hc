package com.example.demo.hospital.repositoy;

import java.util.List;

import com.example.demo.hospital.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	
	public void insertar(CitaMedica cita);
	public List<CitaMedica> listaCitas();

	
	

}
