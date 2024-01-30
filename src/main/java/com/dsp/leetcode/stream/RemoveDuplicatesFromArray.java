package com.dsp.leetcode.stream;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,2};

        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        System.out.println(Arrays.stream(arr).distinct().count());
        Arrays.stream(Arrays.stream(arr).distinct().toArray()).forEach(x-> System.out.print(x+" "));
    }
}
