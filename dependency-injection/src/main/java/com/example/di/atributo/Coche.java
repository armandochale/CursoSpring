/**
 * 
 */
package com.example.di.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author USER
 *
 */
@Component
public class Coche {
	
	@Value("VW")
	private String Marca;
	@Value("1981")
	private Integer Modelo;
	@Autowired
	private Motor motor;

	public Coche() {
	}

	public Coche(String marca, Integer modelo, Motor motor) {
		super();
		Marca = marca;
		Modelo = modelo;
		this.motor = motor;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Integer getModelo() {
		return Modelo;
	}

	public void setModelo(Integer modelo) {
		Modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [Marca=" + Marca + ", Modelo=" + Modelo + ", motor=" + motor + "]";
	}

	
}
