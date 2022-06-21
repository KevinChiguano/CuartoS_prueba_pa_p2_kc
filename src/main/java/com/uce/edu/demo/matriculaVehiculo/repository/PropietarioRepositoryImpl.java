package com.uce.edu.demo.matriculaVehiculo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculaVehiculo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el propietario: "+p);
	}

	

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el propietario con cedula: "+cedula);
	}



	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario = new Propietario();
		propietario.setApellido("Arguello");
		propietario.setCedula(cedula);
		propietario.setFechaNacimiento(LocalDateTime.of(2000, 11, 10, 5, 30));
		return propietario;
	}



	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el propietario: "+p);
	}

}
