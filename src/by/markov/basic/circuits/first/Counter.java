package by.markov.basic.circuits.first;

import java.util.Scanner;

public class Counter {

    public int getSum() {
        int sum = 0;
        int numberOfInput;
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        numberOfInput = scannerInput.nextInt();

        for (int i = 1; i <= numberOfInput; i++) {
            sum += i;
        }
        return sum;
    }
}
