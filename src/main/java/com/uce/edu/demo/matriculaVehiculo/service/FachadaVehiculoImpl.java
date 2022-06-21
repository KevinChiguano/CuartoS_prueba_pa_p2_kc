package com.uce.edu.demo.matriculaVehiculo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaVehiculo.modelo.Vehiculo;
import com.uce.edu.demo.matriculaVehiculo.repository.IVehiculoRepository;

@Service
public class FachadaVehiculoImpl implements IFachadaVehiculo{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	@Qualifier("P")
	private IVehiculoService vehiculoServiceP;
	
	@Autowired
	@Qualifier("L")
	private IVehiculoService vehiculoServiceL;
	
	@Autowired
	private Vehiculo vehiculo;

	@Override
	@Qualifier("L")
	public BigDecimal calcularMatricula(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		
		this.vehiculo = this.iVehiculoRepository.buscar(placa);
		BigDecimal precioMatricula = null;
		
		if(this.vehiculo.getTipo().equalsIgnoreCase("pesado")) {
			precioMatricula = vehiculoServiceP.calcularMatricula(this.vehiculo.getPlaca(), this.vehiculo.getPrecio());
		}else {
			precioMatricula = vehiculoServiceL.calcularMatricula(this.vehiculo.getPlaca(), this.vehiculo.getPrecio());
		}
		
		int resultado = precioMatricula.compareTo(new BigDecimal(2000));
		
		if( resultado ==1) {
			BigDecimal descuento = precioMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			precioMatricula = precioMatricula.subtract(descuento);
		}
		
		return precioMatricula;
	}

}
