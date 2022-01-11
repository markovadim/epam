package by.markov.classes.service.simpleclasses.test;

import by.markov.classes.simpleclasses.testfirst.Test;

import java.util.Scanner;

public class TestService {

    public void showVariables(Test test) {
        System.out.println("First variable: " + test.getA());
        System.out.println("Second variable: " + test.getB());
    }

    public Test changeVariables(Test test) {
        int x, y;
        showVariables(test);        //default variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first variable:");
        x = input.nextInt();
        System.out.println("Enter the second variable:");
        y = input.nextInt();
        test.setA(x);
        test.setB(y);
        System.out.println("New variables: ");
        showVariables(test);          //changed variables
        return test;
    }

    public int getSum(Test test) {
        return test.getA() + test.getB();
    }

    public void searchBigger(Test test) {
        if (test.getA() > test.getB()) {
            System.out.println("A bigger then B");
        } else if (test.getB() > test.getA()) {
            System.out.println("B bigger then A");
        } else System.out.println("A is equal B");
    }
}
