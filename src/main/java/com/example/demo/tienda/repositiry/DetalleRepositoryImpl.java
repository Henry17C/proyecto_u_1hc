package com.example.demo.tienda.repositiry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Detalle;
@Repository
public class DetalleRepositoryImpl implements IDetalleRepository {
  
	private static List<Detalle> badeDatos = new ArrayList<>();
	@Override
	public void insertar(Detalle detalle) {
		badeDatos.add(detalle);
		
	}

}
