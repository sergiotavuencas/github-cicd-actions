package br.com.tavuencas.sergio.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the CI/CD actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
