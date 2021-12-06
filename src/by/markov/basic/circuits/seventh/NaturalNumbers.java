package by.markov.basic.circuits.seventh;

import java.util.Scanner;

public class NaturalNumbers {
    public void getResult() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter the lower border:");
        int m = scannerInput.nextInt();
        System.out.println("Enter the bigger border:");
        int n = scannerInput.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + "|");
                }
            }
            System.out.println();
        }
    }
}
