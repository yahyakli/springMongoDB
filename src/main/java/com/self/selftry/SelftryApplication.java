package com.self.selftry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SelftryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelftryApplication.class, args);
	}

}
