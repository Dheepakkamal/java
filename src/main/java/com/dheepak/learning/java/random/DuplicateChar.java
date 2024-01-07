package com.dheepak.learning.java.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "This is a string that has duplicate characters";
        Map<String, Integer> charCountMap = new HashMap<>();
        for(int i = 0; i< str.length(); i++){
            String character = String.valueOf(str.charAt(i));
            if(charCountMap.containsKey(character)){
                charCountMap.put(character, charCountMap.get(character)+1);
            } else {
                charCountMap.put(character, 1);
            }
        }
        System.out.println(charCountMap);
    }
}
