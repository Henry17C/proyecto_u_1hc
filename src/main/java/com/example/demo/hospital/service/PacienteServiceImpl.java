package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repositoy.IPacienteRepository;

@Service
public class PacienteServiceImpl  implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void registrar(Paciente paciente) {
		this.iPacienteRepository.insertar(paciente);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizar(paciente);
		
		
	}

}
