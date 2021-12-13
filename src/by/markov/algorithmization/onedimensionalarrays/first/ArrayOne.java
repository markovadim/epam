package by.markov.algorithmization.onedimensionalarrays.first;
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К//

import java.util.Random;
import java.util.Scanner;

public class ArrayOne {

    public int getSumOfElements() {
        int n, k;
        int sum = 0;
        int array[];

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n = sc.nextInt();
        array = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(10) + 0;
            System.out.print(array[i] + " |");

        }
        System.out.println('\n');

        System.out.println("Введите кратный элемент: ");
        k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (array[i] % k == 0)
                sum += array[i];
        }

        System.out.println("Сумма кратных элементов =" + sum);
        sc.close();
        return sum;
    }
}
