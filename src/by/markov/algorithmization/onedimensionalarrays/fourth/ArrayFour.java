package by.markov.algorithmization.onedimensionalarrays.fourth;
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFour {

    public void getChange() {
        int n;
        double array[];
        double tempMin, tempMax;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n = sc.nextInt();
        array = new double[n];
        System.out.println("Исходный массив: ");

        for (int i = 0; i < array.length; i++) {                //вывод массива
            array[i] = Math.random() * 200 - 100;
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');

        tempMax = array[0];
        tempMin = array[1];

        for (int i = 0; i < array.length; i++) {            //поиск Мин Макс и занесение во временные переменные
            if (array[i] > tempMax) {
                tempMax = array[i];
            }
            if (array[i] < tempMin) {
                tempMin = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {            //перемена местами мин макс
            if (array[i] == tempMin) {
                array[i] = tempMax;
            } else if (array[i] == tempMax) {
                array[i] = tempMin;
            }
        }

        System.out.println("Новый массив: " + '\n' + Arrays.toString(array));
        sc.close();
    }
}
