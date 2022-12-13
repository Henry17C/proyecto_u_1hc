package com.example.demo.tienda.repositiry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl  implements IClienteRepository{

	
	private static List<Cliente> baseDatos= new ArrayList<>();
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		baseDatos.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		
		
		Cliente cli = null;
		for (Cliente c : baseDatos) {
			if (c.getCedula().equals(cliente.getCedula())) {
				cli=c;
				
				//
				break;
			}
		}
		baseDatos.remove(cli);
		baseDatos.add(cliente);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli = null;
		for (Cliente c : baseDatos) {
			if (c.getCedula().equals(cedula)) {
				cli=c;
			}
		}
	
		return cli;
	}

	@Override
	public void eliminar(String cedula) {
		Cliente cli=buscar(cedula);
		baseDatos.remove(cli);
		
	}

}
