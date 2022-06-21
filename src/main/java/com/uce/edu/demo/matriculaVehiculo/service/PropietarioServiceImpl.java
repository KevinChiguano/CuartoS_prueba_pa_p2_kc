package com.uce.edu.demo.matriculaVehiculo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaVehiculo.modelo.Propietario;
import com.uce.edu.demo.matriculaVehiculo.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Autowired
	private Propietario propietario;
	
	@Override
	public Propietario crearPropietario(String nombre, String apellido, String cedula, LocalDateTime fechaNacimiento) {
		// TODO Auto-generated method stub
		this.propietario.setApellido(apellido);
		this.propietario.setCedula(cedula);
		this.propietario.setFechaNacimiento(fechaNacimiento);
		this.propietario.setNombre(nombre);
		
		this.propietarioRepository.insertar(propietario);
		return propietario;
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
	}

	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(cedula);
	}

	@Override
	public void actualizar(String nombre, String apellido) {
		// TODO Auto-generated method stub
		this.propietario.setApellido(apellido);
		this.propietario.setNombre(nombre);
		this.propietarioRepository.actualizar(propietario);
	}

}
