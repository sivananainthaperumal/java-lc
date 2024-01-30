package com.dsp.leetcode.stream;

import java.util.Arrays;

/*

https://leetcode.com/problems/remove-element/description/

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2};

        //java 8
        removeElement(arr,2);


    }

    private static void removeElement(int[] arr, int i) {
        System.out.println(Arrays.stream(arr).filter(a->a!=i).count());
    }
}
