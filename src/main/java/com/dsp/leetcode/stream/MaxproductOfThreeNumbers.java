package com.dsp.leetcode.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class MaxproductOfThreeNumbers {

    public static void main(String[] args) {

        int[] arr = {1,4,6,7};

        //Arrays.stream(arr).flatMap(i->Arrays.stream(arr).flatMap(j-> Arrays.stream(arr).filter(k-> i!=j&&j!=k&&k!=i).map(k->i*j*k))).forEach(System.out::println);
        System.out.println(Arrays.stream(arr).flatMap(i->Arrays.stream(arr).flatMap(j-> Arrays.stream(arr).filter(k-> i!=j&&j!=k&&k!=i).map(k->i*j*k))).max());
        AtomicInteger max = new AtomicInteger(1);
        int skip = arr.length-3>0?arr.length-3:0;
        Arrays.stream(arr).sorted().skip(skip).forEach(i-> { max.set(max.get() * i);});
        System.out.println(max);

    }

}
