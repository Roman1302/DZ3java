//Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dz3_2 {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите размер массива: ");
        int listSize = input.nextInt();
        ArrayList<Integer> listNum = new ArrayList<Integer>(listSize);
        ArrayList<Integer> listEvenNum = new ArrayList<Integer>(listSize);
        for (int i = 0; i < listSize; i++) {
            listNum.add(randomNum.nextInt(99));
        }
        System.out.println("\nCписок случайных чисел:");
        System.out.println(listNum);
        for (int i = 0; i < listSize; i++) {
            if ((listNum.get(i) % 2) == 0) {
                listEvenNum.add(listNum.get(i));
            }
        }
        listNum.removeAll(listEvenNum);
        System.out.println("\nСписок после удаления всех четных чисел:");
        System.out.println(listNum);
    }
}