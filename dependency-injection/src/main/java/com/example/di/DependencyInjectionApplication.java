package com.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.di.atributo.Coche;
import com.example.di.atributo.Motor;
import com.example.di.qualifiers.Animal;
import com.example.di.qualifiers.Avion;
import com.example.di.qualifiers.Nido;
import com.example.di.qualifiers.Pajaro;
import com.example.di.qualifiers.Perro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Perro perro = context.getBean(Perro.class);
		Pajaro pajaro = context.getBean(Pajaro.class);
		Avion avion = context.getBean(Avion.class);
		//Animal animal = context.getBean("pajarito",Animal.class);
		//log.info("Animal nombre = {} edad = {}",animal.getNombre(),animal.getEdad());
		Nido nido = context.getBean(Nido.class);
		
		nido.imprimir();
		
		
		log.info("Objeto Perro {}",perro.getNombre());
		avion.volar();
		
	}

}
