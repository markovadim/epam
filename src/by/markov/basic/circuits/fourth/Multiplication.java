package by.markov.basic.circuits.fourth;

public class Multiplication {
    private final int TWO_HUNDRED = 200;

    public long getRes() {
        long resultSum = 1;
        for (int i = 1; i <= TWO_HUNDRED; i++) {
            resultSum *= Math.pow(i, 2);
        }
        return resultSum;
    }
}
