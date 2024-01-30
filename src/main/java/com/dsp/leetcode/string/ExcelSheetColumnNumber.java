package com.dsp.leetcode.string;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ExcelSheetColumnNumber {

    static String CONST = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.println("--"+new ExcelSheetColumnNumber().titleToNumber("AA"));
        test("ACA");
    }

    public int titleToNumber(String s) {
        int total = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int pos = CONST.indexOf(c) + 1;
            int pow = (int) Math.pow(26, j++);
            total += (pow * pos);
        }
        return total;
    }

    public static void test(String s){
        AtomicInteger j=  new AtomicInteger(s.length()-1);
        System.out.println(j);
    }
}