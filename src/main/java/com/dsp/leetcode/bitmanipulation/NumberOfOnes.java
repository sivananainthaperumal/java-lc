package com.dsp.leetcode.bitmanipulation;

import java.util.Arrays;

public class NumberOfOnes {

    public static void main(String[] args) {
        int num= 456;
        System.out.println(Integer.toString(num,2));
        calculateOnes(num);
        calculateOnesUsingStream(num);
    }

    private static void calculateOnes(int i) {

        int mask =1;
        int count =0 ;

        for (int j = 0; j < 32; j++) {
            if((i & mask)!=0){
                count++;
            }
            i>>=1;
            System.out.println(Integer.toString(i,2) +"->"+count);
        }
        System.out.println(count);
    }

    //Stream

    private static void calculateOnesUsingStream(int i){
        System.out.println(Arrays.stream(Integer.toString(i,2).split("")).filter(x->x.equals("1")).count());
    }
}
