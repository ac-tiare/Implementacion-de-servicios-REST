package com.edutech.evaluaciones.evaluaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.edutech.evaluaciones.repository")
@EntityScan("com.edutech.evaluaciones.model")
@ComponentScan(basePackages = "com.edutech.evaluaciones")
public class EvaluacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionesApplication.class, args);
	}

}
