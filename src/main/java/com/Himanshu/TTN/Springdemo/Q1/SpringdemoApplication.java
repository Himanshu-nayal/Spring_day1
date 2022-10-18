package com.Himanshu.TTN.Springdemo.Q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {
	public static void printMethod(Student obj){
		obj.display("Himanshu");
	}

	public static void main(String[] args) {
		Student student = new Student();
		SpringdemoApplication.printMethod(student);


	}

	}


