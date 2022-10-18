package com.Himanshu.TTN.Springdemo.Q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Hospital hospital=(Hospital) context.getBean("hosh");
        System.out.println(hospital);

    }
}
