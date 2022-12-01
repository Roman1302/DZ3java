//Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;


public class dz3_3 {
    public static void main(String[] args) {
        
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int listSize = input.nextInt();
        int minNum,maxNum;
        float averNum=0;
        ArrayList<Integer> listNum = new ArrayList<Integer>(listSize);
        for (int i = 0; i < listSize; i++) {
            listNum.add(randomNum.nextInt(99));
            averNum=averNum+listNum.get(i);
        }
        System.out.println("\nCписок случайных чисел: ");
        System.out.println(listNum);
        Collections.sort(listNum);
        System.out.println("\nОтсортированный список: ");
        System.out.println(listNum);
        minNum=listNum.get(0);
        maxNum=listNum.get(listSize-1);
        System.out.println("\nСумма чисел списка = "+averNum);
        averNum=averNum/listSize;
        System.out.println("Минимальное значение = "+minNum);
        System.out.println("Максимальное значение = "+maxNum);
        System.out.println("Среднее значение = "+averNum);
        }
}