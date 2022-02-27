package by.markov.basicsofoop.dragons;

public enum DragonColor {
    BLACK ("Black"),
    WHITE ("White"),
    RED ("Red"),
    YELLOW ("Yellow"),
    GRAY ("Gray"),
    GREEN ("Green"),
    BLUE ("Blue");

    private String color;

    public String getColor() {
        return color;
    }

    DragonColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
