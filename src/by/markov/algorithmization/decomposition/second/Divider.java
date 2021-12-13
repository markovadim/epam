package by.markov.algorithmization.decomposition.second;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Divider {
    public int getGcd(int a, int b) {
        if (b == 0) {

            return a;
        } else
            return getGcd(b, a % b);
    }

    public int getGcd2(int c, int d) {

        if (d == 0) {

            return c;
        } else
            return getGcd2(d, c % d);
    }

    public void getRes(int a, int b, int c, int d) {
        int one = getGcd(a, b);
        int two = getGcd2(c, d);
        System.out.println(getGcd(one, two));
    }
}
