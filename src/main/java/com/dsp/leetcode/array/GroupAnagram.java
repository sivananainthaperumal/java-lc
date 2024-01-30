package com.dsp.leetcode.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.stream.Stream;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */
public class GroupAnagram {

    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};

        //groupAnagram(strs);

        groupAnagramUsingStream(strs);
    }

    private static void groupAnagramUsingStream(String[] strs) {
        Map<String, List<String>> anagrams =
                Arrays.stream(strs).collect(Collectors.groupingBy(w -> sortKey(w)));
        System.out.println(anagrams);
        System.out.println(anagrams.values());
        Map<String,Long> anagramCount = Arrays.stream(strs).collect(Collectors.groupingBy(GroupAnagram::sortKey,Collectors.counting()));
        System.out.println(anagramCount);
        System.out.println(anagramCount.values());
    }

    private static String sortKey(String s){
        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
    }

    public static void groupAnagram(String[] strs){
        HashMap<String,Set> group = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = sortKey(strs[i]);
            if(group.containsKey(key)){
                Set set = group.get(key);
                set.add(strs[i]);
                group.put(key,set);
            }else{
                Set set = new HashSet();
                set.add(strs[i]);
                group.put(key,set);
            }
            System.out.print(key+"->");
            group.get(key).forEach(x-> System.out.print(x+" "));
            System.out.println();
        }
        System.out.println("==="+group.values());

    }
    public static boolean isAnagram(String s, String t){
        if(s.length()==t.length()){

            return Arrays.stream(s.split("")).sorted().collect(Collectors.joining()).equals(
                    Arrays.stream(t.split("")).sorted().collect(Collectors.joining()));

        }else {

            return false;
        }
    }
}
