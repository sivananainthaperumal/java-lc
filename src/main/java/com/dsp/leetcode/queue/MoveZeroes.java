package com.dsp.leetcode.queue;

import java.util.*;

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

        moveZeroUsingUsingQueue(nums);
    }

    private static void print(int[] array){
        Arrays.stream(array).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }

    private static void moveZeroUsingUsingQueue(int[] nums){
        print(nums);

        //loop through the array and find the none zero elements and add them to the queue
        Stack<Integer> queue = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                queue.add(nums[i]);
                //queue.stream().forEach(a-> System.out.print(a+" "));
                //System.out.println();
            }
        }
        queue.stream().forEach(i-> System.out.print(i+" "));
        System.out.println();

        //once all the non-zero values are added to the queue now calculate the difference between array length and queue size and add zeros to the end.
        int zeros = nums.length- queue.size();

        for (int i = 0; i < zeros; i++) {
            queue.add(0);
        }

        queue.stream().forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
}
