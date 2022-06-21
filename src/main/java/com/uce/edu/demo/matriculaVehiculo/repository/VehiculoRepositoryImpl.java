package com.uce.edu.demo.matriculaVehiculo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculaVehiculo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el vehiculo:"+v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Nissan");
		vehiculo.setPlaca(placa);
		vehiculo.setPrecio(new BigDecimal(5000));
		vehiculo.setTipo("pesado");
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el vehiculo: "+v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el vehiculo con placa:"+placa);
	}

}
