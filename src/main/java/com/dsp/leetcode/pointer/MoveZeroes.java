package com.dsp.leetcode.pointer;

import java.util.Arrays;

/**
 * Accepted Given an array nums, write a function to
 * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * <p>For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3,
 * 12, 0, 0].
 *
 * <p>Note: You must do this in-place without making a copy of the array. Minimize the total number
 * of operations.
 */
public class MoveZeroes {

    public static int[] nums = {0,4,0,2,0,3,0,10};

    public static void main(String[] args) {
        moveZeroUsingIteration(nums);

        moveZeroUsingUsingQueue(nums);
    }

    private static void moveZeroUsingUsingQueue(int[] nums) {
    }

    private static void print(int[] array){
        Arrays.stream(array).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }

    private static void moveZeroUsingIteration(int[] nums){
        print(nums);

        //loop twice
        for (int i = 0; i < nums.length-1; i++) {
            //check if the current element is zero, if so push to the last of the array
            //shift the element one position to the previous location.
            if(nums[i]==0){
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1]=0;
                print(nums);
            }
        }
        print(nums);
    }
}
