package com.mdsdigital.prueba.interfaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.mdsdigital.prueba"})
@EnableJpaRepositories(basePackages = {"com.mdsdigital.prueba.infraestructura.persistencia"})
@EntityScan("com.mdsdigital.prueba.dominio.modelo")
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}
