package by.markov.algorithmization.sortarrays.first;
//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//        дополнительный массив.

import java.util.Arrays;
import java.util.Scanner;

public class FirstSort {

    public void getResult() {
        int firstArray[];
        int n, m, k;
        int secondArray[];

        Scanner sc = new Scanner(System.in);
        System.out.println("Размерность первого массива n=");
        n = sc.nextInt();
        System.out.println("Размерность второго массива m=");
        m = sc.nextInt();
        firstArray = new int[n + m];
        secondArray = new int[m];
        System.out.println("The one массив: ");

        for (int i = 0; i < n; i++) {
            firstArray[i] = (int) (Math.random() * 11);
            System.out.print(firstArray[i] + "|");
        }
        System.out.println('\n');

        for (int i = 0; i < m; i++) {
            secondArray[i] = (int) (Math.random() * 11);
            System.out.print(secondArray[i] + "|");
        }
        System.out.println('\n');
        System.out.println("Vvedite k ");
        k = sc.nextInt();

        if ((k >= 0) && (k < n)) {
            for (int i = k + 1; i < n; i++) {
                firstArray[firstArray.length - (n - i)] = firstArray[i];
            }
            int p = 0;
            for (int j = k + 1; j < ((k + 1) + m); j++) {
                firstArray[j] = secondArray[p];
                p++;
            }
            System.out.println(Arrays.toString(firstArray));
        } else
            System.out.println("Нет данного элемента");
        sc.close();
    }
}
