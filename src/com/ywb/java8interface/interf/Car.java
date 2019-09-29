package com.ywb.java8interface.interf;

public interface Car {
    default  void run(){
        System.out.println("Car run");
    }
}
