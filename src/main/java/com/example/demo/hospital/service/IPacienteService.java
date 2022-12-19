package com.example.demo.hospital.service;

import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Paciente;

@Service
public interface IPacienteService {
	
	public void registrar(Paciente paciente);
	public void actualizar (Paciente paciente);
	
	
	

}
