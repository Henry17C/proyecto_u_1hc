package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH {
	
	
	protected Integer calcularDecuento() {
		System.out.println("Paciente Cancer con 30%  descuento");
		return 30;
	}


}
