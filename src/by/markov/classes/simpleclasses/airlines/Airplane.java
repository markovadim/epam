package by.markov.classes.simpleclasses.airlines;

public class Airplane {
    private String model;
    private int numberOfPlacec;

    public Airplane(String model, int numberOfPlacec) {
        this.model = model;
        this.numberOfPlacec = numberOfPlacec;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfPlacec() {
        return numberOfPlacec;
    }

    public void setNumberOfPlacec(int numberOfPlacec) {
        this.numberOfPlacec = numberOfPlacec;
    }

    @Override
    public String toString() {
        return "model: " + model +
                ", number of places: " + numberOfPlacec;
    }
}
