package com.dheepak.learning.java;

import java.util.*;

public class Test {

    private static List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Alchemist", "Paulo Coelho", 1));
        bookList.add(new Book("Harry Potter", "J.K. Rowling", 2));
        bookList.add(new Book("Narnia", "J.K. Rowling", 3));
        bookList.add(new Book("XYZ", "ABC", 4));
        bookList.add(new Book("ABC", "XYZ", 5));
        bookList.add(new Book("ABC", "XYZ", 5));
        return bookList;

    }
    public static void main(String[] args) {
//        var bookList = getBookList();
//        System.out.println(bookList);
//        Collections.sort(bookList);
//        System.out.println(bookList);

        List<Node> nodeList = new ArrayList<>();

//        TestLinkedList testLinkedList = new TestLinkedList(new);
//        var paranthesisMap = new HashMap<>();
//        paranthesisMap.put("[", "]");
//        paranthesisMap.put("(", ")");
//        paranthesisMap.put("{", "}");
//        Stack<String> stack = new Stack<>();
//        String str = "[()]{}{[()()]()}";
////        String str = "[[}}))";
//
//        List<String> openBrackets = List.of("{", "[", "(");
//        List<String> closeBrackets = List.of("}", "]", ")");
//        for(int i = 0; i< str.length(); i++) {
//            String topElem = "";
//            String currentElem = String.valueOf(str.charAt(i));
//            if(!stack.isEmpty())
//                topElem = stack.peek();
//            if(closeBrackets.contains(currentElem)) {
//                if(openBrackets.contains(topElem) && currentElem.equals(paranthesisMap.get(topElem))) {
//                    stack.pop();
//
//                }
//            } else {
//                stack.push(currentElem);
//            }
//        }
//
//        if(stack.isEmpty()) {
//            System.out.println("Balanced");
//        } else {
//            System.out.println("Unbalanced");
//        }

    }
}
