package com.Himanshu.TTN.Springdemo.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolStudent implements Student{
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Autowired
    private Test test;


    @Override
    public void display() {
        System.out.println("school student displaying"+test);

    }
}
