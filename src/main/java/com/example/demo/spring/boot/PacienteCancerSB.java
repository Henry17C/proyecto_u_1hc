package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB {
	
	
	protected Integer calcularDecuento() {
		System.out.println("Paciente Cancer con 30%  descuento");
		return 30;
	}


}
