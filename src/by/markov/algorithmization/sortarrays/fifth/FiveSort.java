package by.markov.algorithmization.sortarrays.fifth;
//Сортировка вставками. Дана последовательность чисел
//n a ,a , ,a 1 2 
//. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
//a a ai
//, , , 1 2  - упорядоченная последовательность, т. е.
//a1  a2  an
//. Берется следующее число
//i+1 a
//и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;
import java.util.Scanner;

public class FiveSort {

    public void sortArray() {
        int array[];
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Размерность: ");
        size = sc.nextInt();
        array = new int[size];
        System.out.println("Массив: ");

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + "|");
        }
        System.out.println('\n');

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
