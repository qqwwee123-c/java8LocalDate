package com.ywb.concurrent.test;

import java.util.concurrent.TimeUnit;

public class 线程顺序执行实现1 {

    static Object lock = new Object();
    static Boolean isRunned = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
           synchronized (lock){
               while (!isRunned) {
                   try {
                        System.out.println("t1 before wait");
                       lock.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println("t1 after wait");
           }
        },"t1").start();
        TimeUnit.SECONDS.sleep(2);
        new Thread(() -> {
            synchronized (lock){
                System.out.println("t2 before notify");
                isRunned = true;
               lock.notify();
                System.out.println("t2 after notify");
            }
        },"22").start();

    }
}
