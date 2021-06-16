package com.ywb.innerclass;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/6/16
 */
public class Test {

    public static void main(String[] args) {
        // 非静态的内部类无法在外部类使用
//        OutClass.NormalInner normalInner = new OutClass.NormalInner();
        OutClass.StaticInner staticInner = new OutClass.StaticInner();
    }
}
