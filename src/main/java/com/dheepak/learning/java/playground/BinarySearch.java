package com.dheepak.learning.java.playground;

import java.util.Arrays;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int start, int end, int key) {
        int mid = (start+end)/2;
        if(start > end) {
            return false;
        }
        if(arr[mid] == key){
            return true;
        }
        if(key < arr[mid]) {
            return binarySearch(arr, start, mid-1, key);
        }
        return binarySearch(arr, mid+1, end, key);
    }
    public static void main(String[] args) {
        int[] arr = {2,10, 5, 9, 13, 17, 21, 30};
        Arrays.sort(arr);
        if(binarySearch(arr, 0, (arr.length-1), 10))
            System.out.println(" Element Found. ");
        else
            System.out.println(" Element not Found.");

    }
}
