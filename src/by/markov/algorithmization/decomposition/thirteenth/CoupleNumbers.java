package by.markov.algorithmization.decomposition.thirteenth;
//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

import java.util.Scanner;

public class CoupleNumbers {

    public void difference(int x) {
        for (int i = x; i < 2 * x - 1; i++) {
            System.out.println(i + "-" + (i + 2));
        }
    }

    public void getCouple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number n: ");
        int number = sc.nextInt();
        difference(number);
        sc.close();
    }
}
