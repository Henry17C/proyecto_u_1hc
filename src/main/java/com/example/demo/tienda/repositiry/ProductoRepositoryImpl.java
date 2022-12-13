package com.example.demo.tienda.repositiry;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Producto;

public class ProductoRepositoryImpl implements IProductoRepository {

	
	private static List<Producto> badeDatos = new ArrayList<>();

	@Override
	public void insertar(Producto producto) {
		badeDatos.add(producto);
		// TODO Auto-generated method stub
		
	}

}
