package com.Himanshu.TTN.Springdemo.Q3;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Test student= (Test) context.getBean(Test.class);
        student.print();

    }
}



