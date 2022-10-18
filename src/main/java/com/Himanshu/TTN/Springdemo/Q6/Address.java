package com.Himanshu.TTN.Springdemo.Q6;

public class Address {
    private int hno;
    private String city;

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hno=" + hno +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private String street;
}
