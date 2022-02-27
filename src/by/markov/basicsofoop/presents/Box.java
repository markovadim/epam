package by.markov.basicsofoop.presents;

public class Box {
    private BoxSize boxSize;
    private Color color;
    private boolean bow;

    private double boxPrice;

    public Box() {
    }

    public Box(BoxSize boxSize, Color color, boolean bow) {
        this.boxSize = boxSize;
        this.color = color;
        this.bow = bow;
    }

    public BoxSize getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(BoxSize boxSize) {
        this.boxSize = boxSize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isBow() {
        return bow;
    }

    public void setBow(boolean bow) {
        this.bow = bow;
    }

    public double getBoxPrice() {
        return boxPrice;
    }

    public void setBoxPrice(double boxPrice) {
        this.boxPrice = boxPrice;
    }

    @Override
    public String toString() {
        return "Box price $: " + boxPrice + ", box color: " + color + ", bow is " + bow;
    }
}
