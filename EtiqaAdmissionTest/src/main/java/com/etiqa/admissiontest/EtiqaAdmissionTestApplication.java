package com.etiqa.admissiontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EtiqaAdmissionTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtiqaAdmissionTestApplication.class, args);
	}

}
