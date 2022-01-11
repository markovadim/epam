package by.markov.classes.service.simpleclasses.customers;

import by.markov.classes.simpleclasses.customers.Customer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerService {

    public void getMenu(Customer[] customers) {
        int choosing;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - print all customers\n2 - customers sort\n3 - print range of cards");
            choosing = input.nextInt();
            switch (choosing) {
                case 1:
                    printAllList(customers);
                    break;
                case 2:
                    printCustomersSorted(customers);
                    break;
                case 3:
                    printNumberOfCardWithUserRange(customers);
                    break;
                default:
                    System.out.println("Operation not fount");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void printCustomersSorted(Customer[] customers) {
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void printAllList(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void printNumberOfCardWithUserRange(Customer[] customers) {
        long minRange, maxRange;
        Scanner scannerOfCardRange = new Scanner(System.in);
        try {
            System.out.println("Enter min range of card: ");
            minRange = scannerOfCardRange.nextLong();
            System.out.println("Enter max range of card: ");
            maxRange = scannerOfCardRange.nextLong();
            for (Customer customer : customers) {
                if ((customer.getNumberOfCard() >= minRange) && (customer.getNumberOfCard() < maxRange)) {
                    System.out.println(customer.toString());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(scannerOfCardRange.nextLine() + " is not a decimal");
        }
    }
}
