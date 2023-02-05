package com.example.reactSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ReactSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringApplication.class, args);
	}

	// 포트 포워딩
	/* 
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// WebMvcConfigurer.super.addCorsMappings(registry);
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");	// 리액트 기본 포트 3000
			}
		};
	}
	*/

}
