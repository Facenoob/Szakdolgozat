package hu.polnikadam.szakdolgozat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SzakdolgozatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzakdolgozatApplication.class, args);
	}

}
