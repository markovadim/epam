package by.markov.basicsofoop.dragons;

public class Cave {
    private String location;
    private Dragon dragon;
    private Treasures treasures;

    private String[] nameOfTreasures;
    private int[] treasuresThePrice;

    public String[] getNameOfTreasures() {
        return nameOfTreasures;
    }

    public int[] getTreasuresThePrice() {
        return treasuresThePrice;
    }

    public String getLocation() {
        return location;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public Treasures getTreasures() {
        return treasures;
    }

    public Cave(String location, Dragon dragon, String[] nameOfTreasures, int[] treasuresThePrice) {
        this.location = location;
        this.dragon = dragon;
        this.nameOfTreasures = nameOfTreasures;
        this.treasuresThePrice = treasuresThePrice;
    }
}
