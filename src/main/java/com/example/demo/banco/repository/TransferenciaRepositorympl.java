package com.example.demo.banco.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
@Repository
public class TransferenciaRepositorympl implements ITransferenciaRepository {
 //acceso a la base de datos
	
	private static List<Transferencia> baseDatos= new ArrayList();
	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		//SELECT * FROM C WHERE C.NUMERO= numeroCuenta
		
		
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
		baseDatos.add(transferencia);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transferencia> bucarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
