package by.markov.basic.lineprograms.fourth;

public class Reverse {
    final int THOUSAND = 1000;

    public double getReverseDouble(double number) {
        double floor_number = Math.floor(number);

        double reverseNumber = (number % ((int) number)) * THOUSAND;
        reverseNumber += floor_number / THOUSAND;
        return reverseNumber;
    }
}
