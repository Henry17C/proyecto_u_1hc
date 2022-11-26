package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component //inversion de control
public class PacienteNinioSB extends PacienteSB {
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

@Override
public String toString() {
	return "PacienteNinioSB [pesoNacimiento=" + pesoNacimiento + "]";
}

}
