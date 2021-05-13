package com.company;

public class Task2 {
    public static int diff(int[] arr){
        int diff = 0;
        int min = arr[0], max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        diff = max - min;
        return diff;
    }
}
