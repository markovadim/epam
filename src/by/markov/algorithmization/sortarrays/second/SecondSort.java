package by.markov.algorithmization.sortarrays.second;
//Даны две последовательности
//        a1  a2  an и b1  b2  bm
//        . Образовать из них новую последовательность
//        чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Scanner;

public class SecondSort {

    public void getArray() {
        int firstArray[];
        int n, m;
        int secondArray[];

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        System.out.println("m=");
        m = sc.nextInt();
        firstArray = new int[n + m];
        secondArray = new int[m];
        System.out.println("The one массив: ");

        for (int i = 0; i < n; i++) {
            firstArray[i] = (int) (1 + i);
            System.out.print(firstArray[i] + "|");
        }
        System.out.println("\nThe two массив: ");

        for (int i = 0; i < m; i++) {
            secondArray[i] = (int) (1 + 2 * i);
            System.out.print(secondArray[i] + "|");
        }
        System.out.println('\n');
        int indexOfArray = 0;

        for (int i = n; i < firstArray.length; i++) {
            firstArray[i] = secondArray[indexOfArray];
            indexOfArray++;
        }
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        sc.close();
    }
}
