package com.ywb;

import java.time.LocalDate;
import java.util.Date;

public class dateTime {

    public static void main(String[] args) {
//        Date d1 = new Date();
//        System.out.println(d1);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);  //print year month and dayofMonth
        LocalDate localDate1 = LocalDate.of(2019,5,8);   //you can assign args for localDate
        System.out.println(localDate1);
        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth()); // print month name(January,May) not num
        System.out.println(localDate1.getMonthValue());  //print month num
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek()); //day name
        System.out.println(localDate1.atStartOfDay());



    }
}
