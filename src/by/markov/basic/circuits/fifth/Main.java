package by.markov.basic.circuits.fifth;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е.

public class Main {

    public static void main(String[] args) {
        double[] array = new double[10];
        LineOfNumbers lineOfNumbers = new LineOfNumbers();
        System.out.println(lineOfNumbers.getSum(array, 0.03));
    }
}
