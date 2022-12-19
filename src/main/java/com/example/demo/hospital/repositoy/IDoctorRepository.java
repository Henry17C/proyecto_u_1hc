package com.example.demo.hospital.repositoy;

import com.example.demo.hospital.modelo.Doctor;

public interface IDoctorRepository {

	public void insertar (Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(String cedula);
	

}
