package by.markov.basic.branching.fifth;

public class Function {
    private final double CONDITION_NUMBER = 3;

    public double getResultOfFunction(int x) {
        if (x <= CONDITION_NUMBER) {
            return getResultIfSmallerThanThree(x);
        } else {
            return getResultIfBiggerThanThree(x);
        }
    }

    public double getResultIfSmallerThanThree(int x) {
        return Math.pow(x, 2) - 3 * x + 9;
    }

    public double getResultIfBiggerThanThree(int x) {
        return 1 / (Math.pow(x, 3) + 6);
    }
}
