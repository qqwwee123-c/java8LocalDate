package com.ywb.concurr;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/6/11
 */
public class CountLatchTest {

    public static CountDownLatch countDownLatch = new CountDownLatch(5);

    public static void main(String[] args) throws Exception{

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("一次countdown"+ LocalDateTime.now());
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();




        countDownLatch.await();
        System.out.println("zhu函数结束"+ LocalDateTime.now());


    }
}
