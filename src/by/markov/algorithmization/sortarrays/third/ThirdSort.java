package by.markov.algorithmization.sortarrays.third;
//Сортировка выбором. Дана последовательность чисел
//        a1  a2  an
//        .Требуется переставить элементы так,
//        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//        элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//        повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;
import java.util.Scanner;

public class ThirdSort {

    public void sort() {
        int array[];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        array = new int[n];
        System.out.println("Массив: ");

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');
        int count = 0;

        for (int i = 0; i < n; i++) {           //СОРТИРОВКА ВЫБОРОМ
            int min = i;
            for (int j = i; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (array[min] < array[i]) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен: " + count);
        sc.close();
    }
}
