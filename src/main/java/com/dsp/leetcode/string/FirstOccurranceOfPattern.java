package com.dsp.leetcode.string;

public class FirstOccurranceOfPattern {

    public static void main(String[] args) {
        getIndexOfFirstUniquePatternUsingStream("asdfaadsasdflkjadsfj","aaadsd");
    }

    public  static void getIndexOfFirstUniquePatternUsingStream(String haystack,String needle){

        if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle));
        }else{
            System.out.println("-1");
        }
    }
}
