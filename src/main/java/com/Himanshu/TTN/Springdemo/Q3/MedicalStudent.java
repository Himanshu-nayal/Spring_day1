package com.Himanshu.TTN.Springdemo.Q3;

import org.springframework.stereotype.Component;

@Component
public class MedicalStudent implements Student{
    @Override
    public void display() {
        System.out.println("displaying mediacl student details");

    }
}
