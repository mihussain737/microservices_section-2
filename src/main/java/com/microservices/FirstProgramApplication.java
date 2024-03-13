package com.microservices;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
@ComponentScans({@ComponentScan("com.eazybytes.accounts.controller")})
@EnableJpaRepositories("com.eazybytes.accounts.repository)
@EntityScan("com.eazybytes.accoounts.model")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices REST API Documentation",
				description = "EazyBank Account Microservices REST API Documentation",
				version="v1",
				contact = @Contact(
						name="Md Imam Hussain",
						email="mihussain737@gmail.com"
				),
				license = @License
						(
								name = "Apache 2.0"
						)

		), externalDocs = @ExternalDocumentation(
				description = "EazyBank Account Microservices REST API Documentation",
		url = "https://www."
)
)
public class FirstProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProgramApplication.class, args);
	}

}
