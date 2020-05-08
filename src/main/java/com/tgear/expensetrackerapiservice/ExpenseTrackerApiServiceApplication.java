package com.tgear.expensetrackerapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tgear.expensetrackerapiservice.repositories.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ExpenseTrackerApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApiServiceApplication.class, args);
	}

}
