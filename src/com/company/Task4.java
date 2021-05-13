package com.company;

public class Task4 {
    public static int[] task4(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                arr[i] += arr[j];
            }
        }
        return arr;
    }
}
