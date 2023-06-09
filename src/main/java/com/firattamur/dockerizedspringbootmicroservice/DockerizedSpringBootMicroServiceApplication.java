package com.firattamur.dockerizedspringbootmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DockerizedSpringBootMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizedSpringBootMicroServiceApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello Docker World";
	}

}
