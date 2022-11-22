package com.example.demo.herencia;

public class MedicoH {
	private String nombre;
	private String cedula;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

}
