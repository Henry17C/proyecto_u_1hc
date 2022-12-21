package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import com.example.demo.ejercicio1.service.IGestorMatriculaService;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
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
	/*@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Qualifier("grande")
	@Autowired
	private ITransferenciaService iTransferenciaService;
	*/
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaService;
	
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	@Autowired IGestorMatriculaService gestorMatriculaService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1HCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		// TODO Auto-generated method stub
				System.out.println("SPRING BOOT");
				
				//Opcion 1
				Vehiculo vehi = new Vehiculo();
				vehi.setMarca("Toyta");
				vehi.setPlaca("PDF12654");
				vehi.setPrecio(new BigDecimal(20000));
				vehi.setTipo("P");
				this.iVehiculoService.crear(vehi);
				//Es una opcion
				vehi.setPrecio(new BigDecimal(10000));
				vehi.setMarca("Toyota");
				
				this.iVehiculoService.modificar(vehi);
				
				//Opcion 2
				
				
				Propietario propietario = new Propietario();
				propietario.setApellido("Colon");
				propietario.setCedula("154774566");
				propietario.setFechaNacimiento(LocalDateTime.of(1978, 8,31,12,35));
				propietario.setNombre("Edison");
				 this.iPropietarioService.guardar(propietario);
				 
				 this.gestorMatriculaService.matricular("154774566", "PDF12654");
				 
				 //Logica de negocio no puede estar aqui
			
				



		}
		}


