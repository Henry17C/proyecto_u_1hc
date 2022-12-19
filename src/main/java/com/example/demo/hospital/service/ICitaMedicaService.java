package com.example.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.hospital.modelo.CitaMedica;
public interface ICitaMedicaService {
	public void insertar(String pacienteNombre, String doctorNombre,BigDecimal precio, LocalDateTime fecha,String numero);
	public List<CitaMedica> listaCitas();

}
