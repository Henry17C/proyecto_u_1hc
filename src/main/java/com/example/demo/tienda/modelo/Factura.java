package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Factura {
	
	private String numeroFactura;
	private LocalDateTime fecha;
	private Cliente cliente;
	private List<Detalle> detalles;
	private BigDecimal total;
	private BigDecimal subtotal;
	private BigDecimal iva;
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}
	@Override
	public String toString() {
		return "Factura [numeroFactura=" + numeroFactura + ", fecha=" + fecha + ", cliente=" + cliente + ", detalles="
				+ detalles + ", total=" + total + ", subtotal=" + subtotal + ", iva=" + iva + "]";
	}
	
	
	//set y get
	
	

	
	

}
