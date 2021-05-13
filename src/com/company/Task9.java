package com.company;

public class Task9 {
    public static boolean isPrefix(String string1,String string2){
        if (string1.indexOf(string2) == 0) return true;
        else return false;
    }
    public static boolean isSuffix(String string1,String string2){
        if (string1.endsWith(string2)) return true;
        else return false;
    }
}
