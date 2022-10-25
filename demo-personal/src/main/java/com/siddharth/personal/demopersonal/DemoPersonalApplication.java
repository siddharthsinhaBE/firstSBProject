package com.siddharth.personal.demopersonal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.siddharth.personal.demopersonal")
@EntityScan("com.siddharth.personal.demopersonal")
@EnableJpaRepositories(basePackages = "com.siddharth.personal.demopersonal")
@SpringBootApplication(scanBasePackages={"com.siddharth.personal.demopersonal"})
public class DemoPersonalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoPersonalApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

	}
}
