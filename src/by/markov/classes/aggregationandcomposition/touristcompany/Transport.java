package by.markov.classes.aggregationandcomposition.touristcompany;

public enum Transport {
    AIRPLANE(1), BUS(2), CAR(3);
    private int id;

    Transport(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
