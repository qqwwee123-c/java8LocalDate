package com.ywb.javabese;

public class IntegetTest {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        boolean result = i1 == i2;
        System.out.println("i1 == i2 ?  "+result );

        // new 出来的就不会去取常量池的数据了
        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        boolean result2 = i3 == i4;
        System.out.println("i3 == i4 ?  "+ result2);

        Integer i5 = 129;
        Integer i6 = 129;
        boolean result3 = i5 == i6;
        System.out.println("i5 == i6 ?  "+result3 );

    }
}
