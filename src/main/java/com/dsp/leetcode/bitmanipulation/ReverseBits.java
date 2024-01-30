package com.dsp.leetcode.bitmanipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseBits {

    public static void main(String[] args) {
        int num =234;
        //reverseBits(num);
        reverseBitsUsingStreams(num);
    }

    private static void reverseBitsUsingStreams(int num) {

        //System.out.println(Integer.toUnsignedString(num,2));
        //System.out.println(Integer.numberOfLeadingZeros(num));
        //System.out.println(Integer.numberOfTrailingZeros(num));
        String val = String.format("%1$32s",Integer.toString(num,2)).replace(" ", "0");
        System.out.println(val);
        String reverseString = Arrays.stream(val.split(""))
                                     .collect(Collectors.collectingAndThen(Collectors.toList(),l -> {Collections.reverse(l);return l;}))
                                     .stream()
                                     .collect(Collectors.joining());
        System.out.println(reverseString);
        System.out.println(Integer.parseInt(reverseString,2));

    }

    private static void reverseBits(int num) {
        int result =0;
        for (int i = 0; i < 32; i++) {
            int bit = num & 1; //finding the last bit
            System.out.println(Integer.toString(num,2)+ "-> "+bit);
            num>>=1; //shifting to one position for next operation
            result= result| bit<<(31-i); // oring at the next shifting from the last.
        }
        System.out.println(Integer.toString(result,2));
    }
}
