package org.sabana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SabanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SabanaApplication.class, args);
	}
}
