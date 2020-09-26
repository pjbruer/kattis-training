package pjbruer.kattistraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KattisTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KattisTrainingApplication.class, args);
		System.out.println("Time to katta");
	}
}
