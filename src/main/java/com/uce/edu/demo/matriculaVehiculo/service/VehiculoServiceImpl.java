package com.uce.edu.demo.matriculaVehiculo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaVehiculo.modelo.Vehiculo;
import com.uce.edu.demo.matriculaVehiculo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private Vehiculo vehiculo;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	
	@Override
	public Vehiculo crearVehiculo(String marca, String placa, String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		this.vehiculo.setMarca(marca);
		this.vehiculo.setPlaca(placa);
		this.vehiculo.setPrecio(precio);
		this.vehiculo.setTipo(tipo);
		this.vehiculoRepository.insertar(vehiculo);
		return vehiculo;
	}

	@Override
	public void actualizarVhiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(v);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void eliminarVehiculo(String placas) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placas);
	}

	@Override
	public BigDecimal calcularMatricula(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
