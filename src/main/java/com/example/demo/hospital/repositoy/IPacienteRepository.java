package com.example.demo.hospital.repositoy;

import com.example.demo.hospital.modelo.Paciente;

public interface  IPacienteRepository {
	public void insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(String cedula);
	

}
