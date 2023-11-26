package com.dheepak.learning.java.random.javaquestions;

public class StringPlay {
    public static void main(String[] args) {


        String s = "welcome";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb==sb2);
        System.out.println(sb.equals(s));

        StringBuffer sbuf = new StringBuffer(s);
        System.out.println(sbuf.equals(s));

        String replace = "abab";
        String s1 = replace.replace("a", "");
        String s2 = replace.replaceAll("a", "");
        System.out.println(s1+"-"+s2);

        String a1 = "hello";
        String a2 = new String("hello");
        String a3 = "hello";
        System.out.println(a1==a3);
        System.out.println(a1==a2);
        System.out.println(a1==a2.intern());
        System.out.println(a1==a2);

        String numStr = null;
        System.out.println(numStr+null);

    }
}
