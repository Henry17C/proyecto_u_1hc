package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{
	private static List<Propietario> base = new ArrayList<>();
	@Override
	public void insertar(Propietario vehiculo) {
		base.add(vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
	}

	
	public Propietario propietario(String cedula) {
		Propietario propietario=null;

		for (Propietario p  : base) {
			if (p.getCedula().equals(cedula)) {
				propietario = p;
			}
		}

		return propietario;
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
