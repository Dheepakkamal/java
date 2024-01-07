package com.dheepak.learning.java.ocp_practice.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePlay {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Otto"); words.add("ADA"); words.add("Alyla");
        words.add("Bob"); words.add("HannaH"); words.add("Java");
        System.out.println("List of words:                " + words);
        System.out.println("-----------Using Anonymous Classes---------------------");
        // Use an anonymous class to filter for palindromes (case sensitive).  (1)
        List<String> palindromesA = filterList(words,
                str -> str.contentEquals(new StringBuilder(str).reverse()));
        System.out.println("Case-sensitive palindromes:   " + palindromesA);
        // Use an anonymous class to filter for palindromes (case insensitive). (2)
        List<String> palindromesB = filterList(words,
                new Predicate<String>() {
                    @Override public boolean test(String str) {
                        return str.equalsIgnoreCase(
                                new StringBuilder(str).reverse().toString());
                    } }
        );
        System.out.println("Case-insensitive palindromes: " + palindromesB);
        System.out.println("-----------Using Lambda Expressions--------------------");
        Predicate<String> predicate1 = str ->
                str.contentEquals(new StringBuilder(str).reverse());          // (3)
        List<String> palindromes1 = filterList(words, predicate1);            // (4)
        System.out.println("Case-sensitive palindromes:   " + palindromes1);
        Predicate<String> predicate2 = str ->
                str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());// (5)
        List<String> palindromes2 = filterList(words, predicate2);            // (6)
        System.out.println("Case-insensitive palindromes: " + palindromes2);
    }
    public static <E> List<E> filterList(List<E> list,
                                         Predicate<E> predicate) {
        List<E> result = new ArrayList<>();
        for (E element : list) {
            if (predicate.test(element)) {
                result.add(element);
            } }
        return result;
    }
}
