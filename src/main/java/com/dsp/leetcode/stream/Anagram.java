package com.dsp.leetcode.stream;

import java.util.Arrays;

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

    public static void main(String[] args) {
        String source ="yes";
        String target ="syed";
        boolean isAnagram = false;
        if(source.length()== target.length()) {
            long count = Arrays.stream(source.split("")).sorted().flatMap(i -> Arrays.stream(target.split("")).sorted().filter(j -> i.equals(j))).count();
            isAnagram = true;
        }
        if(isAnagram) {
            System.out.println("The source and target is anagram");
        }else {
            System.out.println("The source and target is not anagram.");
        }
    }
}
