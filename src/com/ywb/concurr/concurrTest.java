package com.ywb.concurr;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class concurrTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> c = new ConcurrentHashMap<>();
//        c.forEach();
//        new ThreadPoolExecutor(3,);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
