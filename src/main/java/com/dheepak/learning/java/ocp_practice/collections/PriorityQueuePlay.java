package com.dheepak.learning.java.ocp_practice.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePlay {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<String> sq = new PriorityQueue<>();
        int[]  unorderedArray = {1, 5, 3, 2, 4};
        String[] unorderedStringArray = {"a", "e", "c", "b", "d"};
        for (int i : unorderedArray) {
            queue.add(i);
        }
        for (String i : unorderedStringArray) {
            sq.add(i);
        }
        System.out.println(queue);
        System.out.println(sq);
    }
}
