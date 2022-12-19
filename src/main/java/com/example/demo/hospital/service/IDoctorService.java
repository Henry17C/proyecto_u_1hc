package com.example.demo.hospital.service;

import com.example.demo.hospital.modelo.Doctor;

public interface IDoctorService {
	
	public void registar(Doctor doc);
	public void actualizar(Doctor doc);
	public Doctor buscar(String cedula);
	
	

}
