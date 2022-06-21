package com.uce.edu.demo.matriculaVehiculo.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Vehiculo {

	private String marca;
	private String placa;
	private String Tipo;
	private BigDecimal precio;

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + placa + ", Tipo=" + Tipo + ", precio=" + precio + "]";
	}

	// SET y GET
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
