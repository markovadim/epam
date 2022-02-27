package by.markov.basicsofoop.presents;

public enum SweetnessType {
    CANDY(10.5),
    CHOCOLATE(15.7),
    CAKE(20.1),
    PIE(15.4),
    MARSHMALLOW(9.8);

    private double price;

    public double getPrice() {
        return price;
    }

    SweetnessType(double price) {
        this.price = price;
    }
}
