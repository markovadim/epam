package by.markov.basicsofoop.services.payments;

import by.markov.basicsofoop.payments.Payment;
import by.markov.basicsofoop.payments.Product;
import by.markov.basicsofoop.services.files.Builder;
import by.markov.basicsofoop.services.files.Creator;
import by.markov.basicsofoop.services.files.Opener;
import by.markov.basicsofoop.textfiles.Directory;
import by.markov.basicsofoop.textfiles.TextFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BasketPay {
    private final int INPUTTING_OF_PASSWORD = 3;
    private final String THE_CHECK_OF_THE_PAY = "check.txt";
    private final String DIRECTORY = System.getProperty("user.dir");

    public boolean payTheBasket(BasketCollector basket, Payment.Card card, Map<Product, Integer> map) throws IOException {
        if (validateOwner(card)) {
            if (basket.getSumToPayment() <= card.getAmount()) {
                System.out.println("Thank you! The order is paid.");
                getCheck(basket.getProductsBasket(), basket, map);
                return true;
            } else {
                System.out.println("The order was not paid. Not enough money.");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean validateOwner(Payment.Card card) {
        boolean result = false;
        int inputPassword;
        int attemptInput = INPUTTING_OF_PASSWORD;
        Scanner scannerName = new Scanner(System.in);

        try {
            while (attemptInput != 0) {
                System.out.println("Enter the password of the cardholder:");
                inputPassword = scannerName.nextInt();
                if (card.getOwner().getPassword() == inputPassword) {
                    result = true;
                    break;
                } else {
                    attemptInput--;
                    System.out.println("The password is not right. You have is " + attemptInput + " attempts.");
                    result = false;
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("You input don't a number.");
            result = false;
        }

        if (!result) {
            System.out.println("The card is blocked.");
        }
        return result;
    }

    public void getCheck(List<Product> productsBasket, BasketCollector basket, Map<Product, Integer> map) throws IOException {
        String checkFile = "";
        Directory directory = new Directory(DIRECTORY);
        TextFile textFile = new TextFile(directory, THE_CHECK_OF_THE_PAY);

        Creator creator = new Creator();
        creator.createTextFile(textFile);

        checkFile += "Your order #" + new Random().nextInt() + " " + new SimpleDateFormat().format(new Date()) + '\n' + "=============================" + '\n';
        for (Product product : productsBasket) {
            checkFile += product.toString() + "   $" + map.get(product) + '\n';
        }
        checkFile += "=============================" + '\n' + "Sum of the order: $" + basket.getSumToPayment();

        Builder builder = new Builder();
        builder.rewriteText(textFile, checkFile);

        Opener opener = new Opener();
        opener.openTextFile(textFile);
    }
}
