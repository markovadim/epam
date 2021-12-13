package by.markov.algorithmization.decomposition.fourth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaxLine maxLine = new MaxLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix n:");
        int n = scanner.nextInt();
        System.out.println("Enter size of matrix m:");
        int m = scanner.nextInt();

        int[][] dotes = new int[n][m];
        maxLine.initializeCoordinates(dotes);

        System.out.println(maxLine.findMaxDistance(dotes));

    }
}
