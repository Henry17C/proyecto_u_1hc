package com.example.demo.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repositiry.IClienteRepository;
import com.example.demo.tienda.repositiry.IFacturaRepository;
@Service
public class FacturaServiceImpl implements IFacturaService {

	
	@Autowired
	private IFacturaRepository facturaRepository;
	@Autowired
	private IClienteRepository clienteRepository;
	
	
	@Override
	public void generar(String cedulaCliente, List<ItemTO> detalles) {
		
		Cliente clie = this.clienteRepository.buscar(cedulaCliente);
		Factura factura= new Factura();
		factura.setCliente(clie);
		this.facturaRepository.insertar( factura);
		
	}

}
