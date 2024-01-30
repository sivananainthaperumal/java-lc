package com.dsp.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSeq {

    public static void main(String[] args) {
        int []arr = {100,4,200,1,3,2};

        getLongestConsecutiveSeq(arr);
    }

    private static void getLongestConsecutiveSeq(int[] arr) {

        List<Integer> nums= Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        List<Integer> expectedNums = new ArrayList<>();
        HashMap<Integer,Set> entries = new HashMap<>();
        while(nums.size()>0){
            int min =   nums.stream().min((x,y)->x.compareTo(y)).get();
            Set<Integer> set = nums.stream().filter(i->nums.contains(i-1)).collect(Collectors.toSet());
            set.add(min);
            entries.put(min,set);
            expectedNums.addAll(set);
            nums.removeAll(set);
        }
        System.out.println(entries);
        System.out.println(entries.entrySet().stream().sorted(Map.Entry.comparingByKey()).findFirst().get().getValue().size());
    }
}
