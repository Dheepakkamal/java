package com.dheepak.learning.java.random.interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SopraSteria {

    public static void main(String[] args) {
        List<String> delimiters = List.of("/","-", ":");
        List<String>numbers = IntStream.rangeClosed(0,9).mapToObj(String::valueOf).collect(Collectors.toList());

        String memberId = "11111-22222-33333";
        System.out.println(memberId.matches("*\\d-\\d-\\dfin"));
        int hyphenCount = memberId.split("-", -1).length-1;
        System.out.println(hyphenCount);

    }
}
