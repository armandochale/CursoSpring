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
	
	
	private String Marca;
	
	private Integer Modelo;
	
	private Motor motor;

	@Autowired
	public Coche(@Value("VW") String marca,@Value("1981") Integer modelo, Motor motor) {
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
