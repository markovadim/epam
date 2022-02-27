package by.markov.basicsofoop.presents;

import java.util.ArrayList;

public class Present {
    private Box box;
    private ArrayList<Sweetness> sweetnesses;
    private double presentPrice;

    public Present() {
    }

    public Present(Box box, ArrayList<Sweetness> sweetnesses) {
        this.box = box;
        this.sweetnesses = sweetnesses;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public ArrayList<Sweetness> getSweetnesses() {
        return sweetnesses;
    }

    public void setSweetnesses(ArrayList<Sweetness> sweetnesses) {
        this.sweetnesses = sweetnesses;
    }

    public double getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(double presentPrice) {
        this.presentPrice = presentPrice;
    }

    @Override
    public String toString() {
        return "Present: " + box + ", " + sweetnesses + ". \nPrice of present: $" + String.format("%.2f", presentPrice);
    }
}
