package com.laptrinhjava.ASM3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.laptrinhjava.ASM3")
public class Asm3Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Asm3Application.class, args);
	}

}
