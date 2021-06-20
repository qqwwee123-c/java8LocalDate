package com.ywb.concurr;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

/**
 * 达到减到0才能进行下一步操作  ，
 */
public class TestCountdownLatch {
    public static void main(String[] args) throws InterruptedException {
        Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(3);
        new Thread(() -> {
            System.out.println("begin...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
            System.out.println("end...{}"+latch.getCount());
        }).start();
        new Thread(() -> {
            System.out.println("begin...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
            System.out.println("end...{}"+latch.getCount());
        }).start();
        new Thread(() -> {
            System.out.println("begin...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
            System.out.println("end...{}"+latch.getCount());
        }).start();
        System.out.println("waiting...");
        latch.await();
        System.out.println("wait end...");
    }
}
