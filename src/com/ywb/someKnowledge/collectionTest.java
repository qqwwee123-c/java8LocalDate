package com.ywb.someKnowledge;

import java.util.ArrayList;
import java.util.Vector;

public class collectionTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        //比  list.size() == 0 效率更加优秀 。部分集合list.size() 时间复杂度为 O(n) 但是 isEmpty()的复杂度为O(1)
        System.out.println(list.isEmpty());
        System.out.println(list.size());
//        list.add()
        Vector vector = new Vector();
        vector.add("a");

    }
}
