package by.markov.basicsofoop.payments;

import by.markov.basicsofoop.services.payments.BasketCollector;

public class Payment {
    private BasketCollector basket;

    public BasketCollector getBasket() {
        return basket;
    }

    public void setBasket(BasketCollector basket) {
        this.basket = basket;
    }

    public Payment(BasketCollector basket) {
        this.basket = basket;
    }


    public class Card {
        private Owner owner;
        private int amount;
        private String currency;

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Card(Owner owner, String currency, int amount) {
            this.owner = owner;
            this.currency = currency;
            this.amount = amount;
        }
    }
}
