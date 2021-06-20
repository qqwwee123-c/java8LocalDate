package com.ywb.threadpool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Test3 {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(8);
        CountDownLatch countDownLatch = new CountDownLatch(8);
    }
}
