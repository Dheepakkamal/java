package com.dheepak.learning.java.ocp_practice.basic_datatype;

import java.util.stream.StreamSupport;

public class EvalOrder {
    public static void main(String[] args) {
        int j =0;
        System.out.print(eval(j++, " + ") + eval(j++, " * ") * eval(j, "\n"));
    }

    public static int eval(int operand, String str) {        // (3)
        System.out.print(operand + str);       // Print int operand and String str.
        return operand;                 // Return int operand.
    }
    public static void add3(int operand1, int operand2, int operand3) {
        System.out.print(operand1 + operand2 + operand3);
    }






}
