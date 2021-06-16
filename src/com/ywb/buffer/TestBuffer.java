package com.ywb.buffer;

import java.nio.IntBuffer;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/6/8
 */
public class TestBuffer {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(8);
        System.out.println(intBuffer);
        intBuffer.get();
        intBuffer.get();
        intBuffer.put(1);
        intBuffer.put(2);
        System.out.println(intBuffer);
        // flip之后 limit = pos,  pos = 0;    limit: 最大的元素个数
        intBuffer.flip();
        System.out.println(intBuffer);
//        intBuffer.put(3);
//        intBuffer.put(4);

//        intBuffer.put(5);
        System.out.println(intBuffer);
        // get获取当前position的元素 并且 position +1
        System.out.println(intBuffer.get());
        System.out.println(intBuffer.get());
        System.out.println(intBuffer);
    }
}
