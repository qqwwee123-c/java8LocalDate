package com.ywb.threadpool;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestSchuel {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        pool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("sick " +  LocalDateTime.now().toString());
            }
        }, 10, 5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        pool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("goout " +  LocalDateTime.now().toString());
            }
        }, 10, 5,TimeUnit.SECONDS);

    }
}
