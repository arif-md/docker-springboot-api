package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDockerSpringbootApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(DockerSpringbootApiApplication::main).with(TestDockerSpringbootApiApplication.class).run(args);
	}

}
