package by.markov.algorithmization.decomposition.seventh;
//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Factorial {

    public void getSumOfFact() {
        int factorial, Sum = 0;

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                Sum += factorial;
            }
        }
        System.out.println(Sum);
    }
}
