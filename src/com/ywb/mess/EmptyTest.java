package com.ywb.mess;

import java.util.Date;

public class EmptyTest {

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setName("我是鱼");
        fish1.setAddress("address");
        fish1.setAge(11);
        fish1.setBrithday(new Date());
        fish1.setPrice(new Double("1.2"));
        System.out.println(CommonUtil.judgeAnyFieldIsEmpty(fish1,"age"));
    }
}
