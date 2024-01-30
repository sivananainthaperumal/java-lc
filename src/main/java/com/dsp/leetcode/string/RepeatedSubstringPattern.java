package com.dsp.leetcode.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RepeatedSubstringPattern {

    public static String source = "abcabdrcabc";
    public static void main(String[] args) {

        //System.out.println("Repeated Substring pattern ..."+checkForRepeatedSubStringPattern(source));
        checkForRepeatedSubStringPatternUsingStream(source);
    }

    public static boolean checkForRepeatedSubStringPattern(String source){

        boolean ret =false;
        String[] sourceStrArray = source.split("");

        String pattern = source.substring(0,source.indexOf(sourceStrArray[0],1));
        System.out.println(pattern);

        while(source.length()>=pattern.length()){
            if(source.startsWith(pattern)){
                source=source.substring(pattern.length());
            }
        }
        if(source.equals("")){
            ret = true;
        }

        return ret;
    }

    public static  void checkForRepeatedSubStringPatternUsingStream(String source){
        String pattern = source.substring(0,source.indexOf(source.charAt(0),1));
        System.out.println(pattern);
        String[] s = source.split(pattern);
        System.out.println(s.length>0?"False":"True");
    }
}
