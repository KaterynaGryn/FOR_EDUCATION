package com.company.myAdditionalWork;

public class Car {

    public void start(){
        System.out.println("Hurray! My car is going far far far");
    };
    public void stop(){
        System.out.println("My car has just stopped");
    };
    public int drive (int howLong){
        int toralDistanceDrivenForTime = howLong*60;

        return toralDistanceDrivenForTime;
       }

};

