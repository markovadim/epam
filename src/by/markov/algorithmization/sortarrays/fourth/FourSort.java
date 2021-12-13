package by.markov.algorithmization.sortarrays.fourth;
//Сортировка обменами. Дана последовательность чисел
//        a1  a2  an
//        .Требуется переставить числа в
//        порядке возрастания. Для этого сравниваются два соседних числа
//        i i+1 a и a
//        . Если
//        ai  ai+1
//        , то делается
//        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;
import java.util.Scanner;

public class FourSort {

    public void getSort() {
        int array[];
        int size, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        size = sc.nextInt();
        array = new int[size];
        System.out.println("The one массив: ");

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');
        int count = 0;
        boolean sort = true;

        while (sort) {
            sort = false;
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    sort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
        sc.close();
    }
}
