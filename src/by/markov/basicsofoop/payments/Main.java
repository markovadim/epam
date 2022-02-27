package by.markov.basicsofoop.payments;

import by.markov.basicsofoop.services.payments.BasketCollector;
import by.markov.basicsofoop.services.payments.BasketPay;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Product, Integer> map = new HashMap<>();
        map.put(Product.WATER, 120);
        map.put(Product.BROAD, 140);
        map.put(Product.BUTTER, 160);
        map.put(Product.SUGAR, 180);
        map.put(Product.CHOCOLATE, 200);
        map.put(Product.FISH, 220);
        map.put(Product.MILK, 240);
        map.put(Product.BEER, 260);

        Owner vadim = new Owner("VADIM", 1331);

        BasketCollector basket = new BasketCollector();
        basket.chooseProducts(map);

        Payment payment = new Payment(basket);
        Payment.Card vadimCard = payment.new Card(vadim, "$", 640);

        BasketPay basketPay = new BasketPay();
        basketPay.payTheBasket(basket, vadimCard, map);
    }
}
