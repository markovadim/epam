package by.markov.algorithmization.sortarrays.seventh;
//Пусть даны две неубывающие последовательности действительных чисел
//a1  a2  an и b1  b2  bm
//.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1  b2  bm
//в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.Arrays;
import java.util.Scanner;

public class SeventhSort {

    public void sort() {
        int firstArray[];
        int n, m;
        int secondArray[];
        int resultArray[];

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        System.out.println("m=");
        m = sc.nextInt();
        firstArray = new int[n + m];
        secondArray = new int[m];
        resultArray = new int[2 * n + 1];
        System.out.println("Первый массив: ");

        for (int i = 0; i < n; i++) {
            firstArray[i] = i + 3;
            System.out.print(firstArray[i] + "|");
        }
        System.out.println('\n');
        System.out.println("Второй массив: ");

        for (int i = 0; i < m; i++) {
            secondArray[i] = i * 2;
            System.out.print(secondArray[i] + "|");
        }
        System.out.println('\n');
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (secondArray[j] <= firstArray[i]) {

                }
            }
        }
        System.out.println(Arrays.toString(resultArray));
        sc.close();
    }
}
