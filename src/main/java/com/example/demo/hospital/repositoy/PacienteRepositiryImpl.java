package com.example.demo.hospital.repositoy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.Paciente;

@Repository
public class PacienteRepositiryImpl implements IPacienteRepository{

	private static List<Paciente> base= new ArrayList<>();
	
	@Override
	public void insertar(Paciente paciente) {
		
		base.add(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		
		Paciente pa= null;
		for(Paciente p: base) {
			if(p.getCedula().equals(paciente.getCedula())) {
				pa=p;
				
			}
		}

		base.remove(pa);
		base.add(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		Paciente pa= null;
		for(Paciente p: base) {
			if(p.getCedula().equals(cedula)) {
				pa=p;
			
			}
		}
		return pa;
	}
	

}
