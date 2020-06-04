package com.infotech.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@SpringBootConfiguration
@Configuration


public class SpringBootBatchXmlToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBatchXmlToDbApplication.class, args);
	}

}
