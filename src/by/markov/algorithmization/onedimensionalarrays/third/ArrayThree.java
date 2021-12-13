package by.markov.algorithmization.onedimensionalarrays.third;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//        положительных и нулевых элементов.

import java.util.Random;
import java.util.Scanner;

public class ArrayThree {

    public void getResult() {
        int n;
        double array[];
        int countPlus = 0;
        int countMinus = 0;
        int countNull = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность :");
        n = sc.nextInt();
        array = new double[n];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 200 - 100;
            if (array[i] < 0) {
                countMinus++;
            } else if (array[i] > 0) {
                countPlus++;
            } else countNull++;
            System.out.print(array[i] + "|");
        }

        System.out.println('\n' + "Количество положительных элементов: " + countPlus);
        System.out.println("Количество отрицательных элементов: " + countMinus);
        System.out.println("Количество нулевых элементов: " + countNull);
        sc.close();
    }
}
