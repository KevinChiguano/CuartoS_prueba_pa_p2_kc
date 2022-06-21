package com.uce.edu.demo.matriculaVehiculo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculaVehiculo.modelo.Matricular;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricular m) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso la matricula: "+m);
	}

}
