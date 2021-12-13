package by.markov.algorithmization.decomposition.eighth;
//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

import java.util.Scanner;

public class SumOfSequence {

    public void getSumOfSequence() {
        int[] array;
        int k, m, sizeOfArray, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Размерность: ");
        sizeOfArray = sc.nextInt();
        array = new int[sizeOfArray];
        System.out.println("массив: ");

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');

        do {
            System.out.println("k=");
            k = sc.nextInt();
            System.out.println("m=");
            m = sc.nextInt();
        } while ((k > m) || ((m - k) <= 2) || (k <= 0) || (k > sizeOfArray) || (m > sizeOfArray));

        for (int i = k + 1; i <= m - 1; i++) {
            sum = array[i - 1] + array[i] + array[i + 1];
            System.out.println(array[i - 1] + "+" + array[i] + "+" + array[i + 1] + "=" + sum);
        }
        sc.close();
    }
}
