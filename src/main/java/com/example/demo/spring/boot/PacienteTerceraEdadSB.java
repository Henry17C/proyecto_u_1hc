package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteTerceraEdadSB extends PacienteSB {
	protected Integer calcularDecuento() {
		System.out.println("Paciente con 20%  descuento");
		return 20;
	}

	
	private String codigoIES;
	private String  nombre;
	private String tipo;
	private String cedula;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCodigoIES() {
		return codigoIES;
	}
	public void setCodigoIES(String codigoIES) {
		this.codigoIES = codigoIES;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
