package com.estudio.proyectoFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*PARA INGRESAR A LA PAGINA WEB, EL USUARIO SIEMPRE ES "USER" Y LA CONTRASEÑA
ESTA GENERADA AUTOMATICAMENTE EN EL OUTPUT DE NEAT-BEANS*/

/*Acordate que lo puse en la version 5.24*/

@SpringBootApplication
public class ProyectoFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
