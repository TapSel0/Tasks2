package com.company;

public class Task10 {
    public static int task10(int steps){
        int fields = 0;
        for(int i = 1; i <= steps; i++){
            fields = fields + (i%2 * 4 - 1);
        }
        return fields;
    }
}
