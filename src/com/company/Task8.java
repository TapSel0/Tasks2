package com.company;

import java.util.Locale;

public class Task8 {
    public static boolean task8(String string1, String string2){
        if(string1.charAt(0) == string2.charAt(string2.length()-1) && string2.charAt(0) == string1.charAt(string1.length()-1))
            return true;
        else return false;
    }
}
