package by.markov.basicsofoop.presents;

public class Sweetness {
    private SweetnessType sweetnessType;

    public Sweetness(SweetnessType sweetnessType) {
        this.sweetnessType = sweetnessType;
    }

    public SweetnessType getSweetnessType() {
        return sweetnessType;
    }

    @Override
    public String toString() {
        return sweetnessType + ", price:$" + sweetnessType.getPrice();
    }
}
