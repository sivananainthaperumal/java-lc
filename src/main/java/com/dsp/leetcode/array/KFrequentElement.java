package com.dsp.leetcode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*

Code
Testcase
Test Result
Test Result
347. Top K Frequent Elements
Medium
Topics
Companies
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

 */
public class KFrequentElement {

    public static void main(String[] args) {
        int[] nums = {10,10,10,3,3,2,2,2,10};
        int k=2;
        getKFrequentElements(nums,2);
    }

    private static void getKFrequentElements(int[] nums, int i) {
        Map<Object, Long> ans= Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        ans.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(i)
                .forEach(x-> System.out.println(x.getKey()));
    }

    public static Integer get(int x){
        return x;
    }
}
