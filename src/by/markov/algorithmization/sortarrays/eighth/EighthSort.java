package by.markov.algorithmization.sortarrays.eighth;
//Даны дроби
//Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

import java.util.Arrays;
import java.util.Scanner;

public class EighthSort {

    public void sort() {
        int[] firstArray;
        int[] secondArray;
        int denominator = 1, sizeOfArray;

        Scanner sc = new Scanner(System.in);
        System.out.println("Размерность массива: ");
        sizeOfArray = sc.nextInt();
        firstArray = new int[sizeOfArray];
        secondArray = new int[sizeOfArray];
        System.out.println("Первый массив: ");

        for (int i = 0; i < sizeOfArray; i++) {
            firstArray[i] = (int) (Math.random() * 11);
            System.out.print(firstArray[i] + "|");
        }
        System.out.println('\n');
        System.out.println("Второй массив: ");

        for (int i = 0; i < sizeOfArray; i++) {
            secondArray[i] = (int) (Math.random() * 11);
            System.out.print(secondArray[i] + "|");
        }
        System.out.println('\n');

        for (int i = 0; i < sizeOfArray; i++) {
            denominator *= secondArray[i];
        }

        for (int j = 0; j < sizeOfArray; j++) {
            firstArray[j] *= denominator / secondArray[j];
            secondArray[j] = denominator;
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println();
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        sc.close();
    }
}
