package by.markov.algorithmization.decomposition.first;
//. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Divider {

    public int getDivider(int a, int b) {

        if (b == 0) {
            System.out.println(a);
            return a;
        } else
            return getDivider(b, a % b);
    }

    public int getNok(int a, int b) {
        return a * b / getDivider(a, b);

    }
}