package com.ywb.someKnowledge;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        //new Bigdecimal()  构造 bigdecimal (传入为双精度 或单精度时)会造成精度的损失
        BigDecimal bd1 = new BigDecimal(10.10D);
        System.out.println(bd1);
        //use this func
        BigDecimal bd2 = BigDecimal.valueOf(10.10);
        System.out.println(bd2);
        BigDecimal bd3 = new BigDecimal("0.1");
        System.out.println(bd3);

        BigDecimal bd4 = new BigDecimal(-1.1);
        BigDecimal bd5 = new BigDecimal(0);
        BigDecimal bd6 = BigDecimal.valueOf(10.1);
        System.out.println(bd2 +"  "+bd6);

        System.out.println(bd2.compareTo(bd6));
        System.out.println(bd1.compareTo(BigDecimal.ZERO));
        System.out.println(bd4.compareTo(BigDecimal.ZERO));
        System.out.println(bd5.compareTo(BigDecimal.ZERO));

    }
}
