package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;



@SpringBootApplication
public class PruebaPaP2KcApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2KcApplication.class, args);
	}

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService gestorService;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Totota");
		vehiculo.setPlaca("PCT8976");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("L");
		
		this.iVehiculoService.insertar(vehiculo);
		
		vehiculo.setPrecio(new BigDecimal(40000));
		vehiculo.setMarca("Toyota");
		this.iVehiculoService.actualizar(vehiculo);
		
		Propietario pro = new Propietario();
		pro.setApellido("Cayambe");
		pro.setNombre("Edison");
		pro.setCedula("123456789");
		pro.setFechaNacimiento(LocalDateTime.now());
		this.iPropietarioService.crear(pro);
		
		this.gestorService.generar("123456789", "PCT8976");
	}
}
