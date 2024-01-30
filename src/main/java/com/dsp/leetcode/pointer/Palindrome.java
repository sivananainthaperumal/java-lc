package com.dsp.leetcode.pointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //isPalindromeUsingStream(s);
        System.out.println(isPalindrome(s));

    }

    private static boolean isPalindrome(String s) {
        Object pal[] = s.toLowerCase()
                .chars()
                .filter(a ->Character.isLetterOrDigit(a))
                .mapToObj(b->(char)b)
                .map(String::valueOf)
                .toArray();

        int end = pal.length-1;
        for (int i = 0; i < end/2; i++) {
            if(!pal[i].equals(pal[end-i])){
                return false;
            }
        }
        return true;

    }

    private static void isPalindromeUsingStream(String s) {

        String pal = s.toLowerCase()
                .chars()
                .filter(x->Character.isLetterOrDigit(x))
                .mapToObj(y-> (char) y)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(pal);
        String palReverse = s.toLowerCase()
                .chars()
                .filter(x->Character.isLetterOrDigit(x))
                .mapToObj(y-> (char)y)
                .map(String::valueOf)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), l->{
                            Collections.reverse(l);
                            return l;
                        }
                )).stream()
                .collect(Collectors.joining());
        System.out.println(pal.equals(palReverse));
    }

    public static boolean isPalindrom(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
