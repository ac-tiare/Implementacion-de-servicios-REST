package com.edutech.calificaciones.calificaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.edutech.calificaciones.repository")
@EntityScan(basePackages = "com.edutech.calificaciones.model")
@ComponentScan(basePackages = "com.edutech.calificaciones")

public class CalificacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalificacionesApplication.class, args);
	}

}
