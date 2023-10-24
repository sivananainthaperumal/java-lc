package com.dsp.leetcode.pointer;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in
 * place such that each element appear only once and return the new length.
 *
 * <p>Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * <p>For example, Given input array nums = [1,1,2],
 *
 * <p>Your function should return length = 2, with the first two elements of nums being 1 and 2
 * respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicates {

    public static int[] nums={1,2,2,4};
    public static void main(String[] args) {
        print(nums);
        int size = removeDuplicates(nums);
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        int divider=0;
        //shift the values to the left as long as they are equal, if not
        // move to the next index
        for (int i = 0; i < nums.length-1; i++) {
            int j=i+1;
            if(nums[i]==nums[j] && nums[i]!=0){
                for (; j < nums.length; j++) {
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1]=0;
                divider++;
                --i;
            }
        }

        print(nums);
        return (divider==0)?nums.length:nums.length-divider;
    }

    public static void print(int[] nums){
        Arrays.stream(nums).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
}
