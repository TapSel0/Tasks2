package com.company;

public class Task6 {
    public static int task6(int a){
        int x1 = 0, x2 = 1;
        for(int i = 0; i < a; i++){
            x2 = x2 + x1;
            x1 = x2 - x1;
        }
        return x2;
    }
}
