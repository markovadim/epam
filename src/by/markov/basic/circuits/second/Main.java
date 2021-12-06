package by.markov.basic.circuits.second;
// Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = -15;
        int b = 15;
        int h = new Random().nextInt(3) + 1;
        int y;
        System.out.println(h);

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("х = " + i + " | у = " + y);
        }
    }
}
