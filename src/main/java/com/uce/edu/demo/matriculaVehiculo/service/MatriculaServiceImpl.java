package com.uce.edu.demo.matriculaVehiculo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaVehiculo.modelo.Matricular;
import com.uce.edu.demo.matriculaVehiculo.modelo.Propietario;
import com.uce.edu.demo.matriculaVehiculo.modelo.Vehiculo;
import com.uce.edu.demo.matriculaVehiculo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	@Qualifier("P")
	private IVehiculoService iVehiculoService;
	
	@Autowired 
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private Vehiculo vehiculo;
	
	@Autowired 
	private Propietario propietario;
	
	@Autowired
	private IFachadaVehiculo fachadaVehiculo;
	
	
	@Override
	public void realizarMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		this.propietario = this.iPropietarioService.buscarPropietario(cedula);
		this.vehiculo = this.iVehiculoService.buscarVehiculo(placa);
		this.vehiculo.setPlaca("123");
		this.vehiculo.setPrecio(new BigDecimal(5000));
		BigDecimal mat = fachadaVehiculo.calcularMatricula(this.vehiculo.getPlaca(), this.vehiculo.getPrecio());
		
		Matricular m = new Matricular();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(this.propietario);
		m.setVehiculo(this.vehiculo);
		m.setValorMatricula(mat);
		
		this.iMatriculaRepository.insertar(m);
	}

}
