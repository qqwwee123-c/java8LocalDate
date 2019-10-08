package com.ywb.letcode;

import java.util.*;

public class shortSubString {

    //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    //继续完善
    public static void main(String[] args) {
        String s =  "asdljakfoaipqbcghd";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;

    }
}
