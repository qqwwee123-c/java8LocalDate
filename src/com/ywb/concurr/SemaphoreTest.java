package com.ywb.concurr;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/6/11
 */
public class SemaphoreTest {

    public static Semaphore semaphore = new Semaphore(5);
    public static CountDownLatch countDownLatch = new CountDownLatch(5);
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    System.out.println("尝试进入"+ Thread.currentThread().getId());
                    semaphore.acquire();
                    Thread.sleep(5000);
                    System.out.println("进入"+ Thread.currentThread().getId());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }).start();
        }
        countDownLatch.await();

    }
}
