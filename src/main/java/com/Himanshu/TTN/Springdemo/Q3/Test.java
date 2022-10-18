package com.Himanshu.TTN.Springdemo.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    MedicalStudent medicalStudent;

    public Test(MedicalStudent medicalStudent) {
        this.medicalStudent = medicalStudent;
    }

    private String name;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '/' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        medicalStudent.display();
    }
}
