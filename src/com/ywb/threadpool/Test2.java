package com.ywb.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test2 {

    public static void main(String[] args) {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor)Executors.newFixedThreadPool(8);
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
