package com.aditya.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Student student = new Student(22, "Aditya");

		System.out.println("Student Name: "+ student.getName());
		System.out.println("Student Age: " + student.getAge());

	}

}
