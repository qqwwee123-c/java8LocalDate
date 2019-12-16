package com.ywb.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatTest {
    public static void main(String[] args) {
        String[] words = new String[]{"Hello","World"};
        List<String[]> stream2 = Arrays.asList(words).stream().map(word -> word.split("")).collect(Collectors.toList());

    }
}
