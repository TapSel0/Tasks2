package com.company;

public class Task3 {
    public static boolean task3(int[] arr){
        float sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return (sum/arr.length == Math.floor(sum/arr.length));
    }
}
