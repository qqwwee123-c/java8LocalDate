package com.ywb.java8localdate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class instantTest {
    public static void main(String[] args) {
        //UTC
        Instant instant = Instant.now();  // return Clock.systemUTC().instant();

        System.out.println(instant);
        // 当前时区
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
