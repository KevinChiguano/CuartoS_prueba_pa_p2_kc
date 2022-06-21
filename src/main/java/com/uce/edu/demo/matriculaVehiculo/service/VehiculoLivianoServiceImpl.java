package com.uce.edu.demo.matriculaVehiculo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaVehiculo.modelo.Vehiculo;

@Service
@Qualifier("L")
public class VehiculoLivianoServiceImpl implements IVehiculoService{

	@Override
	public Vehiculo crearVehiculo(String marca, String placa, String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarVhiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarVehiculo(String placas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularMatricula(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.10));
		
		return valorMatricula;
	}

}
