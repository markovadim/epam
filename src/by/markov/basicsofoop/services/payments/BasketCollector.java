package by.markov.basicsofoop.services.payments;

import by.markov.basicsofoop.payments.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BasketCollector {
    public static final int BASKET_CAPACITY = 4;
    private int sumToPayment;
    private List<Product> productsBasket;

    public int getSumToPayment() {
        return sumToPayment;
    }

    public List<Product> getProductsBasket() {
        return productsBasket;
    }

    public void chooseProducts(Map<Product, Integer> mapOfProducts) {
        int currentAmountOfProducts = 0;
        sumToPayment = 0;
        String currentProduct;
        boolean isProduct = true;

        productsBasket = new ArrayList<>();
        System.out.println("Assortment of products:");

        for (Product product : Product.values()) {
            System.out.println(product + " $" + mapOfProducts.get(product));
        }

        Scanner scannerOfProduct = new Scanner(System.in);
        System.out.println("The capacity of a basket is 4 products.");
        int counter = BASKET_CAPACITY;
        do {
            System.out.println("What is to put in the basket? The basket has a " + counter + " place.");
            currentProduct = scannerOfProduct.nextLine().toUpperCase();

            for (Product product : Product.values()) {
                if (product.toString().equalsIgnoreCase(currentProduct)) {
                    productsBasket.add(product);
                    currentAmountOfProducts++;
                    sumToPayment += mapOfProducts.get(product);
                    counter--;
                    break;
                } else {
                    isProduct = false;
                    continue;
                }
            }
            if (!isProduct) {
                System.out.println("This product is not in the assortment. Select a product of the assort.");
            }
        } while (currentAmountOfProducts < BASKET_CAPACITY);
        this.sumToPayment = sumToPayment;
        System.out.println("Your basket: " + productsBasket.toString() + '\n' + "Sum: " + sumToPayment);
    }
}
