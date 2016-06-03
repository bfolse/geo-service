package com.ttb.service.geo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GeoServiceImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoServiceImplApplication.class, args);
	}
}
