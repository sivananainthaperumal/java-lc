package com.dsp.leetcode.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static int[] nums={1,2,2,2};

    public static void main(String[] args) {
       List<Integer> arr= Arrays.stream(nums).boxed().sorted().distinct()
               .collect(Collectors.toList());
       arr.stream().forEach(i-> System.out.print(i+" "));
        System.out.println();
       System.out.println(arr.stream().count());
    }
}
