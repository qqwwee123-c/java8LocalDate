package com.ywb.concurr;

import java.util.concurrent.Semaphore;

/*-
  限制同时访问资源的线程数
 */
public class TestSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        // 2. 10个线程同时运行
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                // 3. 获取许可
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getId()+"获得");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    // 4. 释放许可
                    semaphore.release();
                    System.out.println(Thread.currentThread().getId()+"释放");
                }
            }).start();
        }

    }
}
