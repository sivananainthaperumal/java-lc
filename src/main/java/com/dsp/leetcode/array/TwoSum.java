package com.dsp.leetcode.array;

/*
Given an array of integers, return indices of the
 * two numbers such that they add up to a specific target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>Example: Given nums = [2, 7, 11, 15], target = 9,
 *
 * <p>Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * <p>Solution: O(n log n). Wrap index and element in a class and sort in increasing order. Do a two
 * pointer sum and compare. An alternative solution is to use hashing which is a O(n) solution - For
 * each element e check if element (target - e) is already found in hashset, if yes return their
 * index, else add this to hash-set and continue.

 https://github.com/gouthampradhan/leetcode/blob/master/src/main/java/array/TwoSum.java
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15,5,3,6};

        int target = 9;

        //iterate the array twice and compare for the target and add to the list of int[].
        List<int[]> pair = Arrays.stream(nums).sorted().boxed()
                .flatMap(i->Arrays.stream(nums).sorted().boxed()
                        .filter(j->i+j==target)
                        .map(j-> new int[]{i,j}))
                .collect(Collectors.toList());


        pair.forEach(t-> System.out.println(t[0]+","+t[1]));
        System.out.println("---");
        List<int[]> pair2 = pair.subList(0,(pair.size()/2));
        pair2.forEach(t-> System.out.println(t[0]+","+t[1]));




    }
}
