package com.example.demo.banco.repository;
import org.springframework.stereotype.Repository;


import com.example.demo.banco.modelo.Transferencia;
@Repository
public class TransferenciaRepositorympl implements ITransferenciaRepository {
 //acceso a la base de datos
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
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
