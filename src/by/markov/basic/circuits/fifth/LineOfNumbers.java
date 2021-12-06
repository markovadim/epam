package by.markov.basic.circuits.fifth;

public class LineOfNumbers {

    public double getSum(double[] arrayOfElements, double e) {
        double sumOfElements = 0;

        for (int i = 0; i < arrayOfElements.length; i++) {
            arrayOfElements[i] = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            System.out.println(arrayOfElements[i]);
            if (Math.abs(arrayOfElements[i]) >= e) {
                sumOfElements += arrayOfElements[i];
            }
        }
        return sumOfElements;
    }
}
