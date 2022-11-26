package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteTerceraEdadSB extends PacienteSB {
	protected Integer calcularDecuento() {
		System.out.println("Paciente con 20%  descuento");
		return 20;
	}

	private String codigoIES;



	public String getCodigoIES() {
		return codigoIES;
	}





	public void setCodigoIES(String codigoIES) {
		this.codigoIES = codigoIES;
	}





	
	


}
