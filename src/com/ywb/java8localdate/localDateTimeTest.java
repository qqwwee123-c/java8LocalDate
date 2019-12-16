package com.ywb.java8localdate;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class localDateTimeTest {
    public static void main(String[] args) {


//        calculate();
//    format();
        aboutGet();

    }
    private static void aboutGet(){

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        LocalDateTime localDateTime1 = LocalDateTime.of(2019,8,5,10,21);
        System.out.println(localDateTime1);
        System.out.println(localDateTime1.getChronology());
        System.out.println(localDateTime1.get(ChronoField.YEAR));  // == getYear
        System.out.println(localDateTime1.getYear());
    }

    private static void aboutAdd(){
        LocalDateTime localDateTime1 = LocalDateTime.of(2019,8,5,10,21);

        LocalDateTime localDateTime2 = localDateTime1.plusDays(1);  //return a new obj after opt
        localDateTime2 = localDateTime2.plusDays(1);

        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println(localDateTime3);
        localDateTime3 = localDateTime3.withDayOfMonth(3);
        System.out.println(localDateTime3);
    }
    private static void calculate(){
        LocalDate localDate = LocalDate.now();
    }

    private static void format(){
        LocalDate localDate = LocalDate.now();
        String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1); //20191015
        System.out.println(s2); //2019-10-15
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s3 = localDate.format(dateTimeFormatter);
        System.out.println(s3); //15/10/2019

        String s4 = localDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(s4); //2019-10-15

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String s5 = localDate.format(dateTimeFormatter1);
        System.out.println(s5); //2019/10/15

    }
}
