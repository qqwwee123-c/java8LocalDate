package com.ywb;

import java.time.Instant;
import java.time.LocalDateTime;

public class instantTest {
    public static void main(String[] args) {
        Instant instant = Instant.now();  // return Clock.systemUTC().instant();
        System.out.println(instant);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
