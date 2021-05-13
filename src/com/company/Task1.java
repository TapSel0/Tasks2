package com.company;
import java.util.Scanner;

public class Task1 {
    public static void task1(){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter string - ");
        String string = in.next();
        System.out.print("Enter N - ");
        int repeat = in.nextInt();
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < repeat; j++){
                System.out.print(string.charAt(i));
            }
        }
    }
}
