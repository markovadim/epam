package by.markov.algorithmization.decomposition.fifth;
//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Scanner;

public class SecondMaxElement {

    public void getRes() {
        int n, firstMaxElement, secondMaxElement;
        int[] array;

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        array = new int[n];
        firstMaxElement = 0;
        secondMaxElement = 0;

        for (int i : array) {
            i = (int) (Math.random() * 31);
            if (i > secondMaxElement) {
                firstMaxElement = secondMaxElement;
                secondMaxElement = i;
            } else {
                if (i > firstMaxElement) {
                    firstMaxElement = i;
                }
            }
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println(firstMaxElement);
        System.out.println(secondMaxElement);
        sc.close();
    }
}
