package com.Himanshu.TTN.Springdemo.Q6;

import com.Himanshu.TTN.Springdemo.Q6.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("com/Himanshu/TTN/Springdemo/Q6/config.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee);
    }
}
