package com.te.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("EmployeeManagementSystemApplication");
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("commandLineRunner() method exdcuted!");
		};
	}


}
