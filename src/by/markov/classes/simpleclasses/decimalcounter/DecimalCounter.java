package by.markov.classes.simpleclasses.decimalcounter;
//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecimalCounter {
    public final int MAX_VALUE = 30;
    public final int MIN_VALUE = 0;
    public final int CURRENT_NUMBER = 10;
    private int minBorder, maxBorder, currentBorder;


    public int getUpDecimalCounter() {
        int resultCounter = CURRENT_NUMBER;
        System.out.println("Start counter = " + resultCounter);
        while (resultCounter < MAX_VALUE) {
            resultCounter++;
            System.out.println("The Decimal counter = " + resultCounter);
            if (resultCounter == MAX_VALUE) {
                System.out.println("Decimal counter has reached its maximum value.");
            }
        }
        return resultCounter;
    }

    public int getUpDecimalCounterWithYourOwnValues(int minBorder, int maxBorder, int currentBorder) {
        System.out.println("Start counter = " + currentBorder);
        while (currentBorder < maxBorder) {
            currentBorder++;
            System.out.println("The Decimal counter = " + currentBorder);
            if (currentBorder == maxBorder) {
                System.out.println("Decimal counter has reached its maximum value.");
            }
        }
        return currentBorder;
    }

    public int getDownDecimalCounter() {
        int resultCounter = CURRENT_NUMBER;
        System.out.println("Start counter = " + resultCounter);
        while (resultCounter > MIN_VALUE) {
            resultCounter--;
            System.out.println("The Decimal counter = " + resultCounter);
            if (resultCounter == MIN_VALUE) {
                System.out.println("Decimal counter has reached its maximum value.");
            }
        }
        return resultCounter;
    }

    public int getDownDecimalCounterWithYourOwnValues(int minBorder, int maxBorder, int currentBorder) {
        System.out.println("Start counter = " + currentBorder);
        while (currentBorder > minBorder) {
            currentBorder--;
            System.out.println("The Decimal counter = " + currentBorder);
            if (currentBorder == minBorder) {
                System.out.println("Decimal counter has reached its maximum value.");
            }
        }
        return currentBorder;
    }

    public void startProgramWithDefaultValues() {
        String symbolOfOperations;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice of operation ('+' or '-'): ");
        symbolOfOperations = scanner.nextLine();
        switch (symbolOfOperations) {
            case "+":
                getUpDecimalCounter();
                break;
            case "-":
                getDownDecimalCounter();
                break;
            default:
                System.out.println("No such operation: " + symbolOfOperations);
        }
        scanner.close();
    }

    public void startProgramWithYourOwnValues() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of the lower range: ");
            minBorder = scanner.nextInt();
            System.out.println("Enter the number of the upper range: ");
            maxBorder = scanner.nextInt();
            System.out.println("Enter the starting number of the counter: ");
            currentBorder = scanner.nextInt();
            if ((minBorder < currentBorder) && (currentBorder < maxBorder)) {
                Scanner scannerOfArithmeticOperation = new Scanner(System.in);
                String symbolOfOperations;
                System.out.println("Choice of operation ('+' or '-'): ");
                symbolOfOperations = scannerOfArithmeticOperation.nextLine();
                switch (symbolOfOperations) {
                    case "+":
                        getUpDecimalCounterWithYourOwnValues(minBorder, maxBorder, currentBorder);
                        break;
                    case "-":
                        getDownDecimalCounterWithYourOwnValues(minBorder, maxBorder, currentBorder);
                        break;
                    default:
                        System.out.println("No such operation: " + symbolOfOperations);
                }
                scannerOfArithmeticOperation.close();
                scanner.close();
            } else {
                System.out.println("Starting number should be bigger then number of lower range and lower then number of upper range.");
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered not a number.");
        }
    }

    public void getVariantOperation() {
        String enteredLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start program with default values - press 1. Start program with your own values - press 2: ");
        enteredLine = scanner.nextLine();
        switch (parseInt(enteredLine)) {
            case 1:
                startProgramWithDefaultValues();
                break;
            case 2:
                startProgramWithYourOwnValues();
                break;
            default:
                System.out.println("Incorrect input!");
        }
        scanner.close();
    }
}
