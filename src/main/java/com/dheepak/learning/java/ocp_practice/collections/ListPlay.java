package com.dheepak.learning.java.ocp_practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListPlay {
    private static List<Integer> getDistinctList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }

    private static List<Integer> getDuplicateItemsList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        return list;
    }

    private static List<Integer> getRetainItemsList() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = getDuplicateItemsList();
        System.out.println(list);
//        list.retainAll(getRetainItemsList());
        list.removeAll(getRetainItemsList());
//        list.addAll(getRetainItemsList());
        System.out.println(list);

        String str = "bananas";
        Character c = 'n';
        System.out.println(IntStream.range(0, str.length())
                .filter(a -> str.charAt(a) == c).boxed()
                .collect(Collectors.toList()));


    }
}
