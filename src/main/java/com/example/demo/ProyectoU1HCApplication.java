package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.hospital.modelo.Doctor;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.service.ICitaMedicaService;
import com.example.demo.hospital.service.IDoctorService;
import com.example.demo.hospital.service.IPacienteService;


@SpringBootApplication
public class ProyectoU1HCApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1HCApplication.class, args);
	}

	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	IDoctorService doctorService;
	@Autowired
	ICitaMedicaService citaMedicaService;
	
	@Override
	public void run(String... args) throws Exception {
	
		
		Paciente paciente= new Paciente();
		paciente.setNombre("Hector");
		paciente.setCedula("175365");
		paciente.setTipo("N");
		this.iPacienteService.registrar(paciente);
		
		Doctor doctor = new Doctor();
		doctor.setCedula("173566");
		doctor.setNombre("Pedro");
		this.doctorService.registar(doctor);
		
		

		
		this.citaMedicaService.insertar("175365", "173566",new BigDecimal(150),LocalDateTime.of(1989,7,7,12,35), "10");
		this.citaMedicaService.listaCitas().stream().forEach(System.out::println);
		
		
		
	}
		}


