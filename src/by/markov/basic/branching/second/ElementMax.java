package by.markov.basic.branching.second;

import java.util.Scanner;

public class ElementMax {
    private int a;
    private int b;
    private int c;
    private int d;

    public int getResult() {
        inputVariables();
        return searchMaxElement((searchMinElement(a, b)), searchMinElement(c, d));
    }

    public void inputVariables() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = scannerInput.nextInt();
        System.out.println("Enter the value of b:");
        b = scannerInput.nextInt();
        System.out.println("Enter the value of c:");
        c = scannerInput.nextInt();
        System.out.println("Enter the value of d:");
        d = scannerInput.nextInt();
    }

    public int searchMinElement(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public int searchMaxElement(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
