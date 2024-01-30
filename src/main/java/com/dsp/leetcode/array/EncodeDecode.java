package com.dsp.leetcode.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncodeDecode {

    public static void main(String[] args) {
        String []arr= {"lint","code","love","you"};
        System.out.println(encode(arr));
        Arrays.stream(decode(encode(arr))).forEach(System.out::println);

    }

    public static String encode(String[] arr){
        return Arrays.stream(arr).collect(Collectors.joining("!"));
    }

    //converting object array to string array
    //#pointer
    public static String[] decode(String str){
       return Arrays.stream(str.split("!")).toArray(val->new String[val]);
    }
}
