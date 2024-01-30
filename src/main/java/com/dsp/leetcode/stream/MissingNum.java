package com.dsp.leetcode.stream;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr[arr.length-1];
        int expectedSum = (n*(n+1))/2;
        System.out.println(expectedSum);
        int actualSum = Arrays.stream(arr).sum();
        System.out.println(expectedSum-actualSum);
    }
}
