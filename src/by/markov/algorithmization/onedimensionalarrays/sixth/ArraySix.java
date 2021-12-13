package by.markov.algorithmization.onedimensionalarrays.sixth;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

import java.util.Scanner;

public class ArraySix {

    public void getSum() {
        int n;
        double[] array;
        double sum = 0;
        boolean isPrimeNumber = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n = sc.nextInt();
        array = new double[n];
        System.out.println("Исходный массив: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (20) - 10;
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');

        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                sum += array[i];

            } else isPrimeNumber = true;
        }

        System.out.println(sum);
        sc.close();
    }
}
