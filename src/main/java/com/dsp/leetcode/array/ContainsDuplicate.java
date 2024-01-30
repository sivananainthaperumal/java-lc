package com.dsp.leetcode.array;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3};

        System.out.println(containsDuplicateUsingStream(arr));
    }

    private static boolean containsDuplicateUsingStream(int[] arr) {
        //long setCount =Arrays.stream(arr).boxed().collect(Collectors.toSet()).stream().count();
        //int arrCount = arr.length;

        return Arrays.stream(arr).boxed().collect(Collectors.toSet()).stream().count() != arr.length;
    }

        public boolean containsDuplicate(int[] nums) {

            Set<Integer> uniques = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (uniques.contains(nums[i])) {
                    return true;
                }
                uniques.add(nums[i]);
            }
            return false;
        }

}
