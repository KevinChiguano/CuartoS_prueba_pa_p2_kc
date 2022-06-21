package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculaVehiculo.service.IMatriculaService;
import com.uce.edu.demo.matriculaVehiculo.service.IPropietarioService;
import com.uce.edu.demo.matriculaVehiculo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2KcApplication implements CommandLineRunner{

	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	@Qualifier("P")
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2KcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.iVehiculoService.crearVehiculo("Nissa","123","pesado", new BigDecimal(5000));
		this.iVehiculoService.actualizarVhiculo(this.iVehiculoService.crearVehiculo("Nissa","123","pesado", new BigDecimal(5000)));
		this.iPropietarioService.crearPropietario("Juan", "Chiguano", "123456", LocalDateTime.now());
		this.iMatriculaService.realizarMatricula("123", "123456");
		
	}

}
