package by.markov.basicsofoop.dragons;

public class Treasures {
    private String typeTreasures;
    private int price;

    public String getTypeTreasures() {
        return typeTreasures;
    }

    public int getPrice() {
        return price;
    }

    public Treasures(String typeTreasures, int price) {
        this.typeTreasures = typeTreasures;
        this.price = price;
    }
}
