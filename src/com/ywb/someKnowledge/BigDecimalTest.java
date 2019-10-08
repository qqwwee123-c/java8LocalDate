package com.ywb.someKnowledge;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        //new Bigdecimal()  构造 bigdecimal 会造成精度的损失
        BigDecimal bd1 = new BigDecimal(1.1);
        System.out.println(bd1);
        //use this func
        BigDecimal bd2 = BigDecimal.valueOf(0.1D);
        System.out.println(bd2);
        BigDecimal bd3 = new BigDecimal("0.1");
        System.out.println(bd3);
    }
}
