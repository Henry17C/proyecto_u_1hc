package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {
	
public static void main(String[] args) {
	
//	PacienteH pacienteTE= new PacienteTerceraEdadH();
//	pacienteTE.setCedula("123132");
//	pacienteTE.setNombre("daniel");
//	pacienteTE.setTipo("TE");
	
//	PacienteH pacienteTE= new PacienteNinioH();
//	pacienteTE.setCedula("123132");
//	pacienteTE.setNombre("daniel");
//	pacienteTE.setTipo("TE");
	
	PacienteH pacienteTE= new PacienteCancerH();
	pacienteTE.setCedula("123132");
	pacienteTE.setNombre("daniel");
	pacienteTE.setTipo("C");
	
	MedicoH medico = new MedicoH();
	medico.setCedula("3132132");
	medico.setNombre("Dianan");
	
	CitaMedicaH cita= new CitaMedicaH();
	cita.agendar("123123",  LocalDateTime.of(2022,12, 2,8,30), pacienteTE,medico);
	
}
	

}
