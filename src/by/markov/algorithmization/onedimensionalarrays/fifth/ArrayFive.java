package by.markov.algorithmization.onedimensionalarrays.fifth;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Scanner;

public class ArrayFive {

    public void printElements() {
        int array[];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n = sc.nextInt();
        array = new int[n];
        System.out.println("Исходный массив: ");

        for (int i = 0; i < array.length; i++) {                //вывод массива
            array[i] = (int) (Math.random() * (200 + 1) - 100);
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');

        for (int i = 0; i < array.length; i++) {                //проверка условия
            if (array[i] > i)
                System.out.print(array[i] + "|");
        }
        sc.close();
    }
}
