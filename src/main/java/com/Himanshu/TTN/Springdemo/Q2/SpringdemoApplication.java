package com.Himanshu.TTN.Springdemo.Q2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {
	public static void main(String[] args) {
		Vehical vehical=new Car();
		Vehical vehical1=new Bike();


		vehical.displayFeature();
		vehical1.displayFeature();
	}

}
