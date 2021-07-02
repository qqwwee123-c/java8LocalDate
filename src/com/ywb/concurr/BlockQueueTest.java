package com.ywb.concurr;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/6/23
 */
public class BlockQueueTest {
    static LinkedBlockingQueue<Integer> linkedBlockingDeque = new LinkedBlockingQueue<>();
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(15);
        for(int i = 0; i < 8; i++){
            executorService.submit(new Product(linkedBlockingDeque));
        }

        for(int i = 0; i < 12; i++){
            executorService.submit(new Customer(linkedBlockingDeque));
        }
        executorService.shutdown();
    }
    static class Product implements Runnable{
        LinkedBlockingQueue<Integer> blockingQueue;
        Product(LinkedBlockingQueue<Integer> blockingQueue){
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            while (true){
                try {
                    int idx = new Random().nextInt();
                    blockingQueue.put(idx);
                    System.out.println(Thread.currentThread().getName() + "生产产品id:" + idx);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    static class Customer implements Runnable{
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Customer(LinkedBlockingQueue<Integer> blockingQueue){
            this.blockingQueue = blockingQueue;
        }
        @Override
        public void run() {
            while (true){
                try {
                    int idx = blockingQueue.take();
                    System.out.println(Thread.currentThread().getName() + "消费产品id:" + idx);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
