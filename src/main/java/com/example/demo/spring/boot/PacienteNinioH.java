package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinioH extends PacienteSB {
private int pesoNacimiento;

public int getPesoNacimiento() {
	return pesoNacimiento;
}

public void setPesoNacimiento(int pesoNacimiento) {
	this.pesoNacimiento = pesoNacimiento;
}


protected Integer calcularDecuento() {
	System.out.println("Paciente Ninio con 10%  descuento");
	return 10;
}

}
