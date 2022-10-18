package com.Himanshu.TTN.Springdemo.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        SuperVehical superVehical=(SuperVehical) context.getBean(SuperVehical.class);
        superVehical.Print();
    }
}
