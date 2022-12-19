package com.example.demo.hospital.repositoy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {

	private static List<CitaMedica> base= new ArrayList<>();
	@Override
	public void insertar(CitaMedica citaMedica) {
		base.add(citaMedica);
		
	}
	@Override
	public List<CitaMedica> listaCitas() {
		// TODO Auto-generated method stub
		return base;
	}
	

}
