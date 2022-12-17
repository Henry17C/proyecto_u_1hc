package com.example.demo.ejercicio1.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	
	private String placa;
	private String tipo;
	private String marca;
	private BigDecimal precio;
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio + "]";
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	

}
