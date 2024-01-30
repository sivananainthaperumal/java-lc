package com.dsp.leetcode.bitmanipulation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountingBits {

    public static void main(String[] args) {
        int num =10;
        countBits(num);
        countBitsUsingStream(num);
    }

    private static void countBitsUsingStream(int num) {
       Object[] as=  IntStream.range(0,num).boxed().map(x-> Arrays.stream(Integer.toString(x,2).split("")).filter(y->y.equals("1")).count()).toArray();
    }

    private static void countBits(int num) {

        int[] ret = new int[num];
        int mask=1;int count=0;
        for (int i = 0; i < num; i++) {
            count=0;
            int val =i;
            for (int j = 0; j < 32; j++) {
                if((val&mask)!=0){
                    count++;
                }
                val>>=1;
            }
            ret[i]=count;
        }
        System.out.println(ret);
    }
}
