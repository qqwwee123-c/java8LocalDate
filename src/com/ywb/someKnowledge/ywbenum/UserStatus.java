package com.ywb.someKnowledge.ywbenum;

public enum  UserStatus {

    DISABLE(0,"不可用"),
    ENABLE(1,"可用")

    ;


    private final int value;  //枚举类中字段要私有
    private final String decoration;


    UserStatus(int value, String decoration) {
        this.value = value;
        this.decoration = decoration;
    }

    public int getValue() {
        return value;
    }

    public String getDecoration() {
        return decoration;
    }
}
