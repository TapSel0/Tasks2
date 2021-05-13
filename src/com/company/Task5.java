package com.company;

public class Task5 {
    public static int task5(String a){
        if(a.indexOf(".") != -1) {
            String[] splitter = String.valueOf(a).split("\\.");
            return splitter[1].length();
        }
        else return 0;
    }
}
