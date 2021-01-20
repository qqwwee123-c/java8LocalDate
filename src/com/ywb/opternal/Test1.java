package com.ywb.opternal;

import java.util.Optional;

public class Test1 {

    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());
        // Exception in thread "main" java.util.NoSuchElementException: No value present
        // System.out.println(empty.get());
        Optional<String> klav = Optional.of("klav");
        System.out.println(klav.isPresent());
        System.out.println(klav.get());
        // 这个api生成的optional对象在进行fitter map的时候 如果有null 不会报空指针
        Optional<String> yiwenbin = Optional.ofNullable("yiwenbin");
        System.out.println(yiwenbin.isPresent());
        System.out.println(yiwenbin.get());
        Optional<Object> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        // Exception in thread "main" java.util.NoSuchElementException: No value present
        // Nullable 还报错 傻逼
        // System.out.println(optional.get());

        klav.ifPresent(value -> System.out.println("lambda  "+value));
        // 当Optional为空时返回orElse的值 不为空返回Optional原值
        String klav1 = klav.orElse("klav1");
        System.out.println(klav1);
        Object imnotempty = empty.orElse("我不是空");
        System.out.println(imnotempty);
        //------------------------------------------
        String klav2 = klav.orElseGet(() -> "klav2");
        System.out.println(klav2);
        Object orElseGet = empty.orElseGet(() -> "你大爷");
        System.out.println(orElseGet);
        //-----------------------------
        String klav3 = klav.orElseThrow(() -> new RuntimeException("klav"));
        System.out.println(klav3);
//        Object empty1 = empty.orElseThrow(() -> new RuntimeException("empty"));
//        System.out.println(empty1);
        //-----------------------------------
    }
}
