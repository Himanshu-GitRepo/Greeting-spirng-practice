package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitLearningProjectApplication {
	
	@GetMapping("/greeting/{name}")
	public String greet(@PathVariable String name) {
		return "Hello "+ name+", "+ "Good Morning"; 
	}
	
	@GetMapping("/status")
	public String status() {
		return "how are you";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitLearningProjectApplication.class, args);
	}

}
