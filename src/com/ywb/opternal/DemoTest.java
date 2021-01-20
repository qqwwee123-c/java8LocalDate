package com.ywb.opternal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoTest {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "cat1", "济南", 1);
        Cat cat1 = new Cat(2, "cat1", "济南2", 2);
        Cat cat2 = new Cat(3, "cat1", "济南3", 3);
        Cat cat3 = new Cat(4, "cat1", "济南4", 4);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        Integer integer = cats.stream().map(Cat::getId).min(Integer::compareTo).get();
        System.out.println(integer);
        if (cats.stream().mapToInt(Cat::getId).min().isPresent()) {
            System.out.println(cats.stream().mapToInt(Cat::getId).min().getAsInt());
        }
        cat.setId(null);

        Optional<Cat> optionalCat1 = Optional.of(cat);
        // 虽然id是null 但是不会报空指针
        boolean present1 = optionalCat1.map(Cat::getId).filter(value ->
                value > 3
        ).isPresent();

        System.out.println(present1);

        // cat= null ofnullable生成的optional也不会空指针  ，但是of生成的会报空指针  牛逼啊
        cat = null;
        Optional<Cat> optionalCat = Optional.ofNullable(cat);
        // 虽然id是null 但是不会报空指针
        boolean present = optionalCat.map(Cat::getId).filter(value ->
                value > 3
        ).isPresent();
        System.out.println(present);



    }
}
