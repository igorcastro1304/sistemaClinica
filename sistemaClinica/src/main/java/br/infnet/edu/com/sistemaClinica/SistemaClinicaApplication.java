package br.infnet.edu.com.sistemaClinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SistemaClinicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaClinicaApplication.class, args);
	}

}
