package by.markov.algorithmization.decomposition.fourteenth;
//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {

    public void getRes() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter the k:");
        int k = scannerInput.nextInt();

        int n, po = 0, count = 0;
        double arm;
        int[] elems = {0, 0, 0, 0};

        for (int i = k; i > 0; i--) {
            for (n = i; n >= 1; count++) {
                elems[count] = n % 10;
                n /= 10;
                po++;
            }
            arm = Math.pow(elems[0], po) + Math.pow(elems[1], po) + Math.pow(elems[2], po) + Math.pow(elems[3], po);

            if (arm == i) {
                System.out.print(i + " ");
            }
            Arrays.fill(elems, 0);
            po = 0;
            count = 0;
        }
    }
}
