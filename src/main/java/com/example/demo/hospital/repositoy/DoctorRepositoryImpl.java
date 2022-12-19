package com.example.demo.hospital.repositoy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository{

	private static List<Doctor> base= new ArrayList<>();
	
	
	@Override
	public void insertar(Doctor doctor) {
		base.add(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		Doctor doctor2=null;
		for(Doctor doc: base) {
			
			if(doc.getCedula().equals(doctor.getCedula())) {
			doctor2= doc;
		}
		}
		base.remove(doctor2);
		base.add(doctor);

	}

	@Override
	public Doctor buscar(String cedula) {

		Doctor doctor2=null;
		for(Doctor doc: base) {
			
			if(doc.getCedula().equals(cedula)) {
			doctor2= doc;

		}
		}

		return doctor2;
	}

	

}
