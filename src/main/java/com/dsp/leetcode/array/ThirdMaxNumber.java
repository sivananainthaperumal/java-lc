package com.dsp.leetcode.array;

import java.util.Arrays;

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

        int[] array = {1,20,3,40};
        int thirdMaxIndex = 2;
        //using bubble sort to sort the array and pick the third largest element
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
        }
        print(array);

        if(array.length<3){
            thirdMaxIndex= array.length;
        }
        System.out.println("\n"+array[thirdMaxIndex]);
    }

    public static void print(int[] array){
        Arrays.stream(array).forEach(System.out::print);
    }
}
