package com.ywb;

import java.time.LocalDate;
import java.util.Date;

public class dateTime {

    public static void main(String[] args) {
//        Date d1 = new Date();
//        System.out.println(d1);
        LocalDate localDate = LocalDate.now();  //
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2019,5,8);
        System.out.println(localDate1);
    }
}
