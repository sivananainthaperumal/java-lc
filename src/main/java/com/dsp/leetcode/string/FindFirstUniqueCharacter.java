package com.dsp.leetcode.string;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Given a string, find the first non-repeating
 * character in it and return it's index. If it doesn't exist, return -1.
 * "leetcode" return 0, as l is the first char and non repeating
 * "system: return 1 as y is the first char and non repeating char
 */
public class FindFirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println("Finding first unique character in a given string ..."+getIndexOfFirstUniqueChar("system"));
        getIndexOfFirstUniqueCharUsingStream("sytem");
    }

    private static int getIndexOfFirstUniqueChar(String str) {

        //return -1 if the str is null or empty
        if(str==null || str.trim().length()==0){
            return -1;
        }else {
            //iterate the string to get each char and check to see if the first and last index of the char is same or not
            //if it is same return the index otherwise continue looping
            //if could not find return the -1;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if( str.indexOf(c) == str.lastIndexOf(c)){
                    return i;
                }
            }
            return -1;
        }

    }

    public static void getIndexOfFirstUniqueCharUsingStream(String str){
        System.out.println(Stream.of(str.split("")).distinct().findFirst().get());
        List<String> chars = Stream.of(str.split("")).filter(i->str.indexOf(i)==str.lastIndexOf(i)).collect(Collectors.toList());
        System.out.println(str.indexOf(Stream.of(str.split("")).filter(i->str.indexOf(i)==str.lastIndexOf(i)).findFirst().get()));
    }



}
