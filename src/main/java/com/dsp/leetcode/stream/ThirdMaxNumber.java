package com.dsp.leetcode.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

/*
Given a non-empty array of integers, return the
 * third maximum number in this array. If it does not exist, return the maximum number. The time
 * complexity must be in O(n).
 *
 * <p>Example 1: Input: [3, 2, 1]
 *
 * <p>Output: 1
 *
 * <p>Explanation: The third maximum is 1. Example 2: Input: [1, 2]
 *
 * <p>Output: 2
 *
 * <p>Explanation: The third maximum does not exist, so the maximum (2) is returned instead. Example
 * 3: Input: [2, 2, 3, 1]
 *
 * <p>Output: 1
 *
 * <p>Explanation: Note that the third maximum here means the third maximum distinct number. Both
 * numbers with value 2 are both considered as second maximum.
 */
public class ThirdMaxNumber {

    public static void main(String[] args) {

        System.out.println("Finding 3rd max number :");

        int[] array = {40,30,40,40};
        int truncate = 3;
        if(array.length<3){
            truncate =array.length;
        }
        System.out.println(Arrays.stream(array).sorted().distinct().skip(array.length-truncate).findFirst().orElse(0));
        System.out.println(Arrays.stream(array).sorted().distinct().skip(array.length-truncate).findFirst().orElse(Arrays.stream(array).max().getAsInt()));

    }
}
