package com.ywb;

import com.ywb.opternal.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {


//        System.out.println("\""   +  "我是你爸爸" + "\"");
//
//
//        List<Object> list = new ArrayList<>();
//        Object o = null;
//
//        for (int i = 0; i < 10 ; i++) {
//            o = new Cat(1, "cat"+i, "addr", i);
//
//            list.add(o);
//        }
//        list.forEach(System.out::println);

        String regex = "^[0-9]{1,20}$";
        System.out.println(Pattern.matches(regex, "13111111111"));

    }
}
