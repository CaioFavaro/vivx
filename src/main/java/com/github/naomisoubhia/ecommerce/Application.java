package com.github.naomisoubhia.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ConditionalOnProperty(name = "jasypt.encryptor.bootstrap", havingValue = "true", matchIfMissing = true)
@Import(EnableEncryptablePropertiesConfiguration.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
