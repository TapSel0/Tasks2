package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какую задачу хотите посмотреть?");
        switch (in.nextInt()){
            case 1:
                System.out.println("Задача №1(повторение символов в строке):");
                Task1.task1();
                break;
            case 2:
                System.out.println("Задача №2(разность чисел в массиве):");
                System.out.print("Введите количество чисел в массиве - ");
                int[] arr2 = new int[in.nextInt()];
                System.out.print("Введите числа массива - ");
                for(int i = 0; i < arr2.length; i++){
                    arr2[i] = in.nextInt();
                }
                System.out.print(Task2.diff(arr2));
                break;
            case 3:
                System.out.println("Задача №3(среднее значение массива == целое число):");
                System.out.print("Введите количество чисел в массиве - ");
                int[] arr3 = new int[in.nextInt()];
                System.out.print("Введите числа массива - ");
                for(int i = 0; i < arr3.length; i++){
                    arr3[i] = in.nextInt();
                }
                System.out.print(Task3.task3(arr3));
                break;
            case 4:
                System.out.println("Задача №4(факториалы в массиве):");
                System.out.print("Введите количество чисел в массиве - ");
                int[] arr4 = new int[in.nextInt()];
                System.out.print("Введите числа массива - ");
                for(int i = 0; i < arr4.length; i++){
                    arr4[i] = in.nextInt();
                }
                System.out.print("Итоговый массив - ");
                arr4 = Task4.task4(arr4);
                for(int i = 0; i < arr4.length; i++){
                    System.out.print(arr4[i] + " ");
                }
                break;
            case 5:
                System.out.println("Задача №5(количество знаков после запятой):");
                System.out.print("Введите число - ");
                System.out.print(Task5.task5(in.next()));
                break;
            case 6:
                System.out.println("Задача №6(числа Фибоначчи):");
                System.out.print("Какое по счёту число нужно? - ");
                System.out.println(Task6.task6(in.nextInt()));
                break;
            case 7:
                System.out.println("Задача №7(почтовый индекс(только 5 цифр)):");
                System.out.print("Введите индекс - ");
                System.out.print(Task7.task7(in.next()));
                break;
            case 8:
                System.out.println("Задача №8(странные строки):");
                System.out.print("Введите 1ую строку - ");
                String str8 = in.next();
                System.out.print("Введите 2ую строку - ");
                String str8_1 = in.next();
                System.out.print(Task8.task8(str8, str8_1));
                break;
            case 9:
                System.out.println("Задача №9(префиксы и окончания):");
                System.out.print("Введите строку - ");
                String str9 = in.next();
                System.out.print("Введите префикс/суффикс(с тире в конце/начале) - ");
                String str9_1 = in.next();
                if(str9_1.charAt(str9_1.length()-1) == '-')
                    System.out.println("Префикс - " + Task9.isPrefix(str9, str9_1.substring(0, str9_1.length()-1)));
                else if(str9_1.charAt(0) == '-')
                    System.out.print("Суффикс - " + Task9.isSuffix(str9, str9_1.substring(1)));
                else System.out.print("Вы не поставили тире у префикса/суффикса!");
                break;
            case 10:
                System.out.println("Задача №10(Количество полей на шаге):");
                System.out.print("Введите № шага - ");
                System.out.print(Task10.task10(in.nextInt()));
                break;
            default:
                System.out.println("Такой задачи нет.");


        }

    }
}
