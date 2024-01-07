package com.dheepak.learning.java.random;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 5};
        int[] arr2 = new int[]{4, 6, 7};
        int a = arr1.length;
        int b = arr2.length;
        int c = a +b;
        int[] mergedArr = new int[c];
        int i =0, j =0, k = 0;
        while(i<a && j<b) {
            if(arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while(i<a) {
            mergedArr[k++] = arr1[i++];
        }

        while(j<b) {
            mergedArr[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(mergedArr));
        char sa;

    }
}
