package by.markov.algorithmization.decomposition.twelveth;
//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {

    public int SumOfNumeral(int x) {
        int sumOfNumerals = 0;//сумма цифр числа массива
        while (x != 0) {
            sumOfNumerals += (x % 10);
            x /= 10;
        }
        return sumOfNumerals;
    }

    public void getRes() {
        int tempArray[] = new int[50];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number K: ");
        int k = sc.nextInt();
        System.out.println("Enter Number N: ");
        int n = sc.nextInt();

        int indexOfTempArray = 0;
        int count = 0;

        for (int i = 0; i <= n; i++) {             //перебор последовательных натуральных чисел
            if (SumOfNumeral(i) == k) {
                System.out.print(i + "\t");
                count++;
                tempArray[indexOfTempArray] = i;                  //временный массив
                indexOfTempArray++;
            }
        }
        int[] resultArray = new int[count];        //итоговый массив

        for (int j = 0; j < count; j++) {
            resultArray[j] = tempArray[j];
        }
        System.out.println();
        System.out.println(Arrays.toString(resultArray));
        sc.close();
    }
}
