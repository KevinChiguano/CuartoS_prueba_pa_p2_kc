package com.uce.edu.demo.matriculaVehiculo.repository;

import com.uce.edu.demo.matriculaVehiculo.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario p);

	public Propietario buscar(String cedula);
	
	public void actualizar(Propietario p);
	
	public void eliminar(String cedula);

}
