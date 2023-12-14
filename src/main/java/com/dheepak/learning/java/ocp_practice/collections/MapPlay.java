package com.dheepak.learning.java.ocp_practice.collections;

import java.util.HashMap;
import java.util.Map;

public class MapPlay {
    public static void main(String[] args) {
        Student s1 = new Student("Dheepak", 30, "A");
        Student s2 = new Student("Dheepak", 30, "A");
        Student s3 = new Student("Dheepak", 30, "A");
        Student s4 = new Student("Dheepak", 4, "A");
        Student s5 = new Student("Dheepak", 30, "A");
        Student s6 = new Student("Dheepak", 30, "A");

        Map<Student, Integer> map = new HashMap<>();
        map.put(s1, 1);
        map.put(s4, 2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(map);
    }
}
