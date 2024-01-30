package com.dsp.leetcode.string;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        String test ="  the     sky is blue";
        reverse(test);
    }

    private static void reverse(String test) {
        //String[] inverse = test.split("\\s+");
        Arrays.stream(test.split("\\s+")).collect(Collectors.collectingAndThen(Collectors.toList(),l->{
            Collections.reverse(l);return l;
        })).forEach(i-> System.out.print(i+" "));

    }
}
