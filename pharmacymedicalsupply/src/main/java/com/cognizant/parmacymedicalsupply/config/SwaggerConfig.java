package com.cognizant.parmacymedicalsupply.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	// Create Docket object - remove unwanted API
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/pharmasupply/**"))
				.apis(RequestHandlerSelectors.basePackage("com.cognizant.parmacymedicalsupply"))
				.build()
				.apiInfo(apiDetails());
				
	}
	
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Pharmacy Supply Doumentation",
				"Medicine Demand and Pharmacy Supply",
				"1.0",
				"Prescribed by Specialist Doctors for free",
				new springfox.documentation.service.Contact("Kiran kumar", "http://www.topic.com", "kirankumar@gmail.com"),
				"Pharmacy License",
				"http://www.pharmasupply.com",
				Collections.emptyList()
				);
		
	}
}
