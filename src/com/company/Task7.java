package com.company;

public class Task7 {
    public static boolean task7(String index){
        if(index.length() == 5){
           return index.matches("[0-9]+");
        }
        return false;
    }
}
