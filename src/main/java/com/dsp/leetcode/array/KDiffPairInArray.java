package com.dsp.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of integers and an integer k, you
 * need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an
 * integer pair (i, j), where i and j are both numbers in the array and their absolute difference is
 * k.
 *
 * <p>Example 1: Input: [3, 1, 4, 1, 5], k = 2 Output: 2 Explanation: There are two 2-diff pairs in
 * the array, (1, 3) and (3, 5). Although we have two 1s in the input, we should only return the
 * number of unique pairs. Example 2: Input:[1, 2, 3, 4, 5], k = 1 Output: 4 Explanation: There are
 * four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5). Example 3: Input: [1, 3, 1, 5,
 * 4], k = 0 Output: 1 Explanation: There is one 0-diff pair in the array, (1, 1). Note: The pairs
 * (i, j) and (j, i) count as the same pair.
 */
public class KDiffPairInArray {

    public static void main(String[] args) {

        int[] array ={1,2,3,4,5};
        int k = 2;
        //values to store the data
        Map<Integer,Integer> map = new HashMap<>();
        List<int[]> ret = new ArrayList<>();

        //save the array to map with distinct values
        for (int i:array) {
            map.put(i,map.getOrDefault(i,0)+1);
        }


        //iterate the map entryset and check if the map key contains current key value - the supplied k
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ ":"+entry.getValue());
            Integer need = entry.getKey() - k;
            if(map.containsKey(need))
                ret.add( new int[]{entry.getKey(),need});
        }


        //print
        for (int[] a: ret) {
            System.out.println(a[0]+","+a[1]);
        }
    }

}
