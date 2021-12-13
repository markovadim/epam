package by.markov.algorithmization.onedimensionalarrays.eighth;
//Дана последовательность целых чисел
//        (a1, a2... an). Образовать новую последовательность, выбросив из
//        исходной те члены, которые равны min(a...an)

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEight {

    public void printNewArray() {
        int min;
        int array[];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n = sc.nextInt();
        array = new int[n];
        System.out.println("Исходный массив случайных чисел: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (30) - 10);
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');

        min = array[0];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                count = 1;
                min = array[i];
            } else {
                if (array[i] == min) {
                    count++;
                }
            }
        }

        System.out.println("Количество минимальных элементов: " + count);
        System.out.println("Минимальный элемент: " + min);

        int newArray[] = new int[n - count];
        int indexOfNewArray = 0;

        for (int i = 0; i < array.length; i++) {          //редактирование массива
            if (array[i] > min) {
                newArray[indexOfNewArray++] = array[i];
            }
        }

        System.out.println(Arrays.toString(newArray));
        sc.close();
    }
}
