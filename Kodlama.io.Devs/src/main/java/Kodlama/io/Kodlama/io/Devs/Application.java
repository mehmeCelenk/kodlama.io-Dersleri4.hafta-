package Kodlama.io.Kodlama.io.Devs;

import Kodlama.io.Kodlama.io.Devs.dataAccsess.concretes.InMemorySoftwareLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
