package com.ywb.functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class test1 {

    public static void main(String[] args) {

    }

    public void test1(Supplier supplier) {
        supplier.get();
    }

    public void test2(Function f) {
        f.apply("");
    }

    public void test3(BiConsumer biConsumer){
        biConsumer.accept("asd","asd");
    }

    public void test4(Consumer consumer) {
        consumer.accept("a");
    }
}
