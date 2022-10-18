package com.Himanshu.TTN.Springdemo.Q4;

import java.util.List;

public class Hospital {
    private String name;
    private List<String> departments;

    public Hospital(String name, List<String> departments) {
        this.name = name;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }
}
