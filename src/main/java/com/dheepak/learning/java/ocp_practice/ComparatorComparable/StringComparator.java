package com.dheepak.learning.java.ocp_practice.ComparatorComparable;

import java.util.*;

public class StringComparator {
    public static <Set> void main(String[] args) {
        List<String> stringList = Arrays.asList("court", "Stuart", "report", "Resort",
                "assort", "support", "transport", "distort");

        String[] words = {"jelly", "bean", "mean", "rally", "volley"};
//        String[] words = {"court", "Stuart", "report", "Resort",
//                "assort", "support", "transport", "distort"};

        Comparator<String> rhymingCompare = (s1, s2) -> {
            String a = new StringBuilder(s1).reverse().toString();
            String b = new StringBuilder(s2).reverse().toString();
            return a.compareTo(b);
        };

        TreeSet<String> rhymingOrder = new TreeSet<>(rhymingCompare);
        Collections.addAll(rhymingOrder, words);
        System.out.println(rhymingOrder);

    }
}
