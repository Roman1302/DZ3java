import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//Реализовать алгоритм сортировки слиянием


public class dz3_1 {
    public static void main(String[] args) {
        System.out.println("\nАлгоритм сортировки слиянием\n");
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int listSize = input.nextInt();
        float averNum = 0;
        ArrayList<Integer> listNum = new ArrayList<Integer>(listSize);
        for (int i = 0; i < listSize; i++) {
            listNum.add(randomNum.nextInt(99));
            averNum = averNum + listNum.get(i);
        }
        System.out.println("\nCписок случайных чисел: ");
        System.out.println(listNum);
        Collections.sort(listNum);
        System.out.println("\nОтсортированный список: ");
        System.out.println(listNum);
    }

    public static int[] Sort(int X[]) {
        if (X.length == 1)
            return X;
        else {
            int half = (int) Math.floor(X.length / 2);
            int halfFirst[] = new int[half];
            int halfSecond[] = new int[X.length - half];
            for (int i = 0; i < X.length; i++) {
                if (i < half)
                    halfFirst[i] = X[i];
                else
                    halfSecond[i - half] = X[i];
            }
            halfFirst = Sort(halfFirst);
            halfSecond = Sort(halfSecond);
            X = SortNext(halfFirst, halfSecond);
            return X;
        }
    }

    public static int[] SortNext(int A[], int B[]) {
        int C[] = new int[A.length + B.length];
        int a = 0, b = 0;
        for (int i = 0; i < A.length + B.length; i++) {
            if (a == A.length) {
                C[i] = B[b];
                b++;
            } else if (b == B.length) {
                C[i] = A[a];
                a++;
            } else if (A[a] > B[b]) {
                C[i] = B[b];
                b++;
            } else {
                C[i] = A[a];
                a++;
            }
        }
        return C;
    }
}