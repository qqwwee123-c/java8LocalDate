package com.ywb.java8localdate;

import java.math.BigDecimal;

public class testbigDecamal {


    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(23.5f);
        BigDecimal b2 = new BigDecimal(23.5f);
        BigDecimal b3= new BigDecimal(23.5);
        System.out.println(b1+"  "+b2);
        System.out.println(b3);
    }
}
