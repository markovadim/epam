package by.markov.algorithmization.decomposition.eleventh;
//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

import java.util.Scanner;

public class SumOfNumeral {

    public int count(int x) {
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public void getRes() {
        int firstNumber, secondNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A: ");
        firstNumber = sc.nextInt();
        System.out.println("Enter Number B: ");
        secondNumber = sc.nextInt();

        if (count(firstNumber) > count(secondNumber)) {
            System.out.println("В числе " + firstNumber + " больше цифр");
        } else if (count(firstNumber) < count(secondNumber)) {
            System.out.println("В числе " + secondNumber + " больше цифр");
        } else System.out.println("В обоих числах одинаковое количество цифр");
    }
}
