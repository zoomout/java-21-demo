package com.bz.test.java_21_demo;

import org.springframework.boot.SpringApplication;

public class TestJava21DemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(Java21DemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
