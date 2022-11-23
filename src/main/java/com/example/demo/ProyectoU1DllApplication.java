package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.herencia.MedicoH;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.PacienteCancerSB;

@SpringBootApplication
public class ProyectoU1DllApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadH pacienteTE;
	@Autowired
	private CitaMedicaSB citaMedicaSB ;
	@Autowired
	MedicoH medico = new MedicoH();

	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SprigBoot");
		
		this.pacienteTE.setCedula("123132123");
		this.pacienteTE.setNombre("Edison");
		this.pacienteTE.setCodigoIES("asdasd");
		this.pacienteTE.setTipo("");
		System.out.println(pacienteTE);
		
		
		//citaMedicaSB.agendar("123123",  LocalDateTime.of(2022,12, 2,8,30), pacienteTE,medico);
		
		
	}

}
