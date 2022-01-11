package by.markov.classes.service.aggregationandcomposition.car;

import by.markov.classes.aggregationandcomposition.car.Car;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarService {
    private final double PRICE_OF_DIESEL = 2.09;
    private final double PRICE_OF_PETROL_A92 = 1.99;
    private final int MIN_RANGE_OF_WHEEL = 1;
    private final int MAX_RANGE_OF_WHEEL = 4;
    private final int MAX_RANGE_OF_FUEL = 60;
    private final int MIN_RANGE_OF_FUEL = 15;

    public boolean isActiveCar(Car car) {
        if (car.getEngine().isWorkable()) {
            return true;
        } else {
            return false;
        }
    }

    public void drive(Car car) {
        if (isActiveCar(car)) {
            System.out.println("Need to refuel the car.");
            double count = refuel(car);
            if (count == 0) {
                System.out.println("The Car is not fill.");
            } else if (count <= MIN_RANGE_OF_FUEL) {
                System.out.println("Perhaps worth staying at home.");
            } else if ((count > MIN_RANGE_OF_FUEL) && (count < MAX_RANGE_OF_FUEL)) {
                System.out.println("Let's go to Brest.");
                if (car.getWheel().isWorkable() == false) {
                    System.out.println("Replace wheel!");
                    changeWheel(car);
                }
            } else if (count > MAX_RANGE_OF_FUEL) {
                System.out.println("Let's go to Saint-Petersburg!");
                if (car.getWheel().isWorkable() == false) {
                    System.out.println("Replace wheel!");
                    changeWheel(car);
                }
            }
        } else {
            System.out.println("Engine is not workable.");
        }
    }

    public double refuel(Car car) {
        double cash, amountOfFuel;

        Scanner scannerOfCash = new Scanner(System.in);
        System.out.println("How mach do you have cash?");
        cash = scannerOfCash.nextDouble();

        if (car.getEngine().getFuelType().equalsIgnoreCase("diesel")) {
            amountOfFuel = cash / PRICE_OF_DIESEL;
            System.out.println(String.format("%.2f", amountOfFuel) + " l of diesel");
            return amountOfFuel;
        } else if (car.getEngine().getFuelType().equalsIgnoreCase("petrol")) {
            amountOfFuel = cash / PRICE_OF_PETROL_A92;
            System.out.println(String.format("%.2f", amountOfFuel) + " l of petrol");
            return amountOfFuel;
        } else {
            System.out.println(car.getEngine().getFuelType() + " not a fuel");
            return 0.0;
        }
    }

    public void changeWheel(Car car) {
        int numberOfWheel;

        try {
            Scanner scannerOfWheel = new Scanner(System.in);
            System.out.println("Which wheel is to be replaced?");
            numberOfWheel = scannerOfWheel.nextInt();
            if ((numberOfWheel >= MIN_RANGE_OF_WHEEL) && (numberOfWheel <= MAX_RANGE_OF_WHEEL)) {
                System.out.println("Changed " + numberOfWheel + " wheel");
            } else {
                System.out.println("Incorrect number of wheel");
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input: ");
        }
    }

    public void printModel(Car car) {
        System.out.println(car);
    }
}
