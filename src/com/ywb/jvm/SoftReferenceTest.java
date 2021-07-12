package com.ywb.jvm;


import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/7/2
 */
public class SoftReferenceTest {

    public static void main(String[] args) {
        String yiwenbin = new String("yiwenbin");
        System.gc();
        System.out.println(yiwenbin);

//        String klav = new String("klav");
//        SoftReference<String>  stringSoftReference = new SoftReference<>(klav);
        SoftReference<String>  stringSoftReference = new SoftReference<>(new String("123abc"));
        System.out.println(stringSoftReference.get());
        System.gc();
        System.out.println(stringSoftReference.get());
//        System.out.println(klav);


        String klav1 = new String("klav1");
        WeakReference<String> weakReference = new WeakReference(klav1);
        System.out.println(weakReference.get());
        // 如果不zhiweinull 就有外部（强）引用引用着这个对象，gc不回清除。
        // 置为null则会清除这个string对象
        klav1 = null;
        System.gc();
        System.out.println(weakReference.get());
//        ThreadLocal
        // 以为ThreadLocal 建议定义为static 这样可以保证有个强引用引用这这个ThreadLocal
        // 尽管threadLocalMap 中的key是弱引用 gc 也不会删除这个key
        char [] chars = new char[] {'1','b','c','2'};
        System.out.println(chars);


        Arrays.asList();
    }
}
