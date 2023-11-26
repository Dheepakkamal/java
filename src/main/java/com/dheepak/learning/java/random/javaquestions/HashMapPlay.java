package com.dheepak.learning.java.random.javaquestions;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapPlay {
    public static void main(String[] args) {
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String("a"), "a");
        identityHashMap.put(new String("a"), "a");
        System.out.println(identityHashMap);

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(new String("a"), "a");
        hashMap.put(new String("a"), "a");
        System.out.println(hashMap);

    }
}
