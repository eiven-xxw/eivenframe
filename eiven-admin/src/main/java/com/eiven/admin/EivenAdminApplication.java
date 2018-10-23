package com.eiven.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
@ComponentScan(basePackages = {"com.eiven.admin"})
public class EivenAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EivenAdminApplication.class, args);
	}
}
