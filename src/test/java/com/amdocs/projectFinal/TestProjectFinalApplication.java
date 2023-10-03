package com.amdocs.projectFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestProjectFinalApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProjectFinalApplication::main).with(TestProjectFinalApplication.class).run(args);
	}

}
