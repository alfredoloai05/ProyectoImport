package com.importapp.registro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
            PROYECTO FINAL
    13/07/2023
    Alfredo Gerardo Loaiza Barrios
*/

@SpringBootApplication
public class RegistroApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
	}
        
        @Bean
        RestTemplate restTemplate(){
            return new RestTemplate();
        }
        
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
            return builder.sources(RegistroApplication.class);
        }   

}
