package com.example.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.CitaMedica;
import com.example.demo.hospital.modelo.Doctor;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repositoy.ICitaMedicaRepository;
import com.example.demo.hospital.repositoy.IDoctorRepository;
import com.example.demo.hospital.repositoy.IPacienteRepository;


@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Autowired
	private IDoctorRepository iDoctorRepository;
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	

	@Override
	public void insertar(String pacienteCedula, String doctorCedula, BigDecimal precio,LocalDateTime fecha, String numero) {
		
		CitaMedica citaMedica=new CitaMedica();
		Doctor doctor=iDoctorRepository.buscar(doctorCedula);
		Paciente paciente = iPacienteRepository.buscar(pacienteCedula);
		
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setNumero(numero);
		citaMedica.setFechaCita(fecha);
		BigDecimal descuento=new BigDecimal(0);
		
		if(paciente.getTipo().equals("TE")) {
			descuento=precio.multiply(new BigDecimal(0.15));
		}
		else if(paciente.getTipo().equals("N")) {
			descuento=precio.multiply(new BigDecimal(0.05));
		}
		citaMedica.setCosto(precio.subtract(descuento));
		
		iCitaMedicaRepository.insertar(citaMedica);
		
		
	
		
		
		
	}


	@Override
	public List<CitaMedica> listaCitas() {
		// TODO Auto-generated method stub
		
		return iCitaMedicaRepository.listaCitas();
	}

}
