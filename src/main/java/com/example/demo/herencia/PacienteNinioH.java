package com.example.demo.herencia;

public class PacienteNinioH extends PacienteH {
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
