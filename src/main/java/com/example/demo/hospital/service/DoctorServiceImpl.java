package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Doctor;
import com.example.demo.hospital.repositoy.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{

	
	@Autowired
	private IDoctorRepository doctorRepository;
	@Override
	public void registar(Doctor doc) {
		// TODO Auto-generated method stub
		doctorRepository.insertar(doc);
		
	}

	@Override
	public void actualizar(Doctor doc) {
		// TODO Auto-generated method stub
		doctorRepository.actualizar(doc);
		
	}

	@Override
	public Doctor buscar(String cedula) {
		// TODO Auto-generated method stub
		return doctorRepository.buscar(cedula);
	}

}
