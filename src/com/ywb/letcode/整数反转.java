package com.ywb.letcode;

/**
 * @Description: 整数反转 leetcode 7
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/7/9
 */
public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static  int reverse(int x) {
        if (Integer.MAX_VALUE <= x || x <= Integer.MIN_VALUE) {
            return 0;
        }
        long result = 0;
        while (true) {
            int temp = x % 10;
//            x = x >> 1;
            x = x / 10;
            result = result*10 + temp;

            if (x == 0) {
                break;
            }
        }
        return (int)result == result ? (int)result: 0;
    }
}
