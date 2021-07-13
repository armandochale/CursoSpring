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

	
	public Coche() {
		
	}
	
	public String getMarca() {
		return Marca;
	}
	@Value("VW") 
	public void setMarca(String marca) {
		Marca = marca;
	}

	public Integer getModelo() {
		return Modelo;
	}
	@Value("1981") 
	public void setModelo(Integer modelo) {
		Modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}
	@Autowired
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [Marca=" + Marca + ", Modelo=" + Modelo + ", motor=" + motor + "]";
	}

	
}
