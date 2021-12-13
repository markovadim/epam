package by.markov.algorithmization.decomposition.tenth;
//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumeral {

    public void getArray() {
        long[] array;
        long n, m;
        int size = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N: ");
        n = sc.nextInt();
        m = n;

        while (m > 10) {
            m /= 10;
            size++;
        }

        size += 1;
        System.out.println(size);
        array = new long[size];

        for (int i = size - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
