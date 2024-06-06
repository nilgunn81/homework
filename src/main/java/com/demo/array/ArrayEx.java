package com.demo.array;

import java.util.Arrays;

public class ArrayEx {
    public static int getThirdLargeNumberInArray(int[]array,int total){
        Arrays.sort(array);
        return array[total-3];
    }
    public static void main(String[] args) {
        int[] array= new int[]{1, 9, 11, 67, 83, 15, 28, 89};
        int[] otherArray= new int[]{101, 54, 24, 67, 12, 120, 87, 45};
        System.out.println("Third Largest number in array "+getThirdLargeNumberInArray(array,array.length));
        System.out.println("Third Largest number in otherArray  "+getThirdLargeNumberInArray(otherArray,otherArray.length));
    }
}