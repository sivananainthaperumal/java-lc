package com.dsp.leetcode.array;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Given two strings s and t, write a function to
 * determine if t is an anagram of s.
 *
 * <p>For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car", return false.
 *
 * <p>Note: You may assume the string contains only lowercase alphabets.
 *
 * <p>Follow up: What if the inputs contain unicode characters? How would you adapt your solution to
 * such case?
 */
public class Anagram {

    //sort two instance of the string and compare each and every character, if count equals same
    public static void main(String[] args) {
        String source = "anagram";
        String target = "nagaram";
        System.out.println(isAnagram(source,target));

    }

    //sort both the string and compare if they are equal.
    public static boolean isAnagram(String src,String tar){
        if(src.length()==tar.length()){
            String source = Arrays.stream(src.split("")).sorted().collect(Collectors.joining());
            String target = Arrays.stream(tar.split("")).sorted().collect(Collectors.joining());
            return source.equals(target);
        }else {
            return false;
        }
    }
}
