package com.dsp.leetcode.array;

/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1

First number and last number is always 1.
Rest of the number is sum of previous numbers arrays two numbers
 */
public class PascalTriangle {

    public static int[] pascalTriangle(int length){

        //declare and initialize two dimensional array
        int[][] array = new int[length][length];

        //iterate to the given length
        for (int i = 1; i <=length ; i++) {

            //limit in populating the array second dimensional array
            for (int j = 0; j <i; j++) {

                //set the first and last array indices value to 1.
                if(j==0 || j==i-1){
                    array[i-1][j]=1;
                }else {
                    //if not add the previous array's penultimate values ( important )
                    array[i-1][j]= array[i-1-1][j-1]+array[i-1-1][j];
                }
                System.out.print(array[i-1][j]+" ");
            }
            System.out.println();
        }

        return array[length];
    }

    public static void main(String[] args) {

        System.out.println("pascal triangle");
        int[] retArray = pascalTriangle(9);
        for (int i = 0; i < retArray.length; i++) {
            System.out.print(retArray[i]+" ");
        }
    }
}
