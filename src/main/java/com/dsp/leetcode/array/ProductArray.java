package com.dsp.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 */
public class ProductArray {

    public static void main(String[] args) {
        int []nums = {1,5,3,4};

        arrayProductwithoutSelf(nums);
    }

    private static void arrayProductwithoutSelf(int[] arrays) {

        List<Integer> arr = Arrays.stream(arrays).boxed().collect(Collectors.toList());
        long zeroCount = arr.stream().filter(i->i==0).count();
        List<Integer> list = new ArrayList<>();

        if(zeroCount>1){
           list = arr.stream().map(i-> 0).collect(Collectors.toList());
        }else if(zeroCount==1) {
            list = arr.stream().map(i-> {
                return i!=0?0: arr.stream().filter(a->a!=0).reduce(1,(x,y)->x*y);
            }).collect(Collectors.toList());
        }else {
            list = Arrays.stream(arrays).boxed()
                    .map(i -> IntStream.of(arrays).reduce((x, y) -> x*y).getAsInt() /i)
                    .collect(Collectors.toList());
        }
        System.out.println(list);
    }
}
