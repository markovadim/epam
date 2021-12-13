package by.markov.algorithmization.onedimensionalarrays.tenth;
//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTen {

    public void changeElementsForZero() {
        int array[];
        int sizeOfArray;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        sizeOfArray = sc.nextInt();
        array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите [" + i + "] элемент:");
            array[i] = sc.nextInt();
        }

        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                array[array.length - 1] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
