package com.dheepak.learning.java.dsa_play;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 8));
    }

    private static int binarySearch(int[] arr, int start, int end, int elem) {
        int mid = (start + end) / 2;
        if(start > end) {
            return -1;
        }
        if(arr[mid] == elem) {
            return mid;
        }
        if(arr[mid] > elem) {
            return binarySearch(arr, start, mid - 1, elem);
        }
        if(arr[mid] < elem) {
            return binarySearch(arr, mid + 1, end, elem);
        }
        return -1;
    }
}
