package by.markov.basicsofoop.presents;

public enum BoxSize {
    A6(5.1),
    A5(6.5),
    A4(8.0),
    A3(9.9);

    private double price;

    BoxSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
