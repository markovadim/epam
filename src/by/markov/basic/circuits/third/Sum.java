package by.markov.basic.circuits.third;

public class Sum {
    private final int HUNDRED = 100;

    public long getSum() {
        long resultSum = 0;
        for (int i = 1; i <= HUNDRED; i++) {
            resultSum += Math.pow(i, 2);
        }
        return resultSum;
    }

}
