package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.herencia.MedicoH;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1HCApplication implements CommandLineRunner {

	@Autowired	
	private IVehiculoService iVehiculoService;
	@Autowired	
	private IPropietarioService iPropietarioService;
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1HCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		//opcion1
Vehiculo vehiculo = new Vehiculo();
vehiculo.setMarca("Toyota");
vehiculo.setPlaca("asd1453");
vehiculo.setPrecio(new BigDecimal(200));
vehiculo.setTipo("P");

this.iVehiculoService.crear(vehiculo);

vehiculo.setPrecio(new BigDecimal(10000));
vehiculo.setMarca("Toyota");
this.iVehiculoService.modificar(vehiculo);

//opcion2
Propietario propietario=new Propietario();
propietario.setApellido("Cayambe");
propietario.setCedula("175646");
propietario.setFechaNacimiento(LocalDateTime.of(1989,7,7,12,35));
propietario.setNombre("Ed");
this.iPropietarioService.grardar(propietario);

// opcion 3
this.iMatriculaService.matricular("175646", "asd1453");




		}
		}


