package com.uce.edu.demo.matriculaVehiculo.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.matriculaVehiculo.modelo.Propietario;

public interface IPropietarioService {

	public Propietario crearPropietario(String nombre, String apellido, String cedula, LocalDateTime fechaNacimiento);

	public Propietario buscarPropietario(String cedula);
	
	public void actualizar(String nombre, String apellido);
	
	public void eliminarPropietario(String cedula);

}
