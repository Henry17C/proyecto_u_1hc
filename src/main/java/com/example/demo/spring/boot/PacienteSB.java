package com.example.demo.spring.boot;

public class PacienteSB {
	protected Integer calcularDecuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	private String nombre;
	private String cedula;
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}

	

}
