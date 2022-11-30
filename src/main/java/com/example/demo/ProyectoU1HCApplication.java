package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.herencia.MedicoH;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1HCApplication implements CommandLineRunner {

	@Autowired	
	private ICuentaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1HCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CuentaBancaria cuenta1= new CuentaBancaria();
		cuenta1.setNumero("132132");
		cuenta1.setSaldo(new BigDecimal(10));
		cuenta1.setTipo("C");
		cuenta1.setTipo("Pepe");
		this.bancariaService.insertar(cuenta1);
		
		
		
		CuentaBancaria cuenta2= new CuentaBancaria();
		cuenta2.setNumero("132132");
		cuenta2.setSaldo(new BigDecimal(10));
		cuenta2.setTipo("C");
		cuenta2.setTipo("Diana");
		this.bancariaService.insertar(cuenta2);
		
	}

	
		
	}


