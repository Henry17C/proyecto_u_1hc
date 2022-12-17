package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	IMatriculaRepository iMatriculaRepository;
	@Autowired

	private IPropietarioRepository iPropietarioRepository;
	@Autowired

	private IVehiculoRepository iVehiculoRepository;

	@Override
	public void matricular(String celudula, String placa) {
		Matricula  matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario pro= this.iPropietarioRepository.buscar(celudula);
		matricula.setPropietario(pro);
		
		Vehiculo vehiculo=this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		BigDecimal valor=null;
		if (vehiculo.getTipo().equals("P")) {
			
			valor= vehiculo.getPrecio().multiply(new BigDecimal(0.15));
			
		}else {
			//liviano
			valor= vehiculo.getPrecio().multiply(new BigDecimal(0.10));
			
		}
		
		if(valor.compareTo(new BigDecimal(2000))>1) {
			//-1 izquierda menor
			//0 iguales
			//1 valor izquierda es mayor
			BigDecimal decuento= valor.multiply(new BigDecimal(0.07));
			valor= valor.subtract(decuento);
		}
		
		matricula.setValor(valor);

		this.iMatriculaRepository.insertar(matricula);
	}
	

}
