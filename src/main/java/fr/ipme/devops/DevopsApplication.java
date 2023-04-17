package fr.ipme.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		System.out.println("Bonjour C'est mon premier page de la Region");
		SpringApplication.run(DevopsApplication.class, args);
	}

}
