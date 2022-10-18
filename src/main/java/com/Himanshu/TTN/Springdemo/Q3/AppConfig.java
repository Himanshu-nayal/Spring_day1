package com.Himanshu.TTN.Springdemo.Q3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Q3")
public class AppConfig {
@Bean
public MedicalStudent getMedicalStudent(){
    return new MedicalStudent();
}
@Bean
public Test getTest(){
    return new Test(getMedicalStudent());
}
}
