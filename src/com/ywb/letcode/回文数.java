package com.ywb.letcode;


/**
 * @Description: leetcode 9.回文数
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/7/9
 */
public class 回文数 {
    public static void main(String[] args) {
//        System.out.println(5 / 2);
        System.out.println(isPalindrome(1221));
    }


    /**
     * solution 1  转换成字符串 判断是否会文
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return false;
        }
        String s = Integer.toString(x);
        int length = s.length();
        for (int i = 0; i < length / 2 ; i++) {
            char sub = s.charAt(i);
            char pre = s.charAt(length-1 - i);
            if (sub != pre) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将整个数反转 比较原始数据和反转后的数据。
     * 这样不需要生成新的字符串数据
     * @param x
     * @return
     */
    public static boolean isPalindrome2(int x) {
       return false;
    }
}
