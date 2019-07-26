package com.cassandra.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cassandra.*")
public class SpringbootCassandraDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCassandraDemoApplication.class, args);
	}

}
