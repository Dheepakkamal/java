package com.dheepak.learning.java.gen;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        String str = "Gen Digital interview";
        var indexList = IntStream.range(0, str.length()).filter(ind -> str.charAt(ind) == ' ').boxed().collect(Collectors.toList());

        StringBuilder reversedStringBuilder = new StringBuilder(str.replaceAll(" ", "")).reverse();
        for (Integer i : indexList) {
            reversedStringBuilder.insert(i, " ");
        }
        System.out.println(reversedStringBuilder.toString());
    }
}
