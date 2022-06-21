package com.uce.edu.demo.matriculaVehiculo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculaVehiculo.modelo.Vehiculo;

public interface IVehiculoService {

	public Vehiculo crearVehiculo(String marca, String placa, String tipo, BigDecimal precio);

	public Vehiculo buscarVehiculo(String placa);

	public void actualizarVhiculo(Vehiculo v);

	public void eliminarVehiculo(String placas);
	
	public BigDecimal calcularMatricula(String placa, BigDecimal precio);

}
