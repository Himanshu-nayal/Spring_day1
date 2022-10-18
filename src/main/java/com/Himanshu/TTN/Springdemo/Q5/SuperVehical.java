package com.Himanshu.TTN.Springdemo.Q5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SuperVehical {
    @Autowired
    Vehical vehical;

    public Vehical getVehical() {
        return vehical;
    }

    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }
    public void Print(){
        System.out.println("displaying super vehiacl");
        vehical.display();
    }
}
