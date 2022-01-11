package by.markov.classes.aggregationandcomposition.touristcompany;

public enum Supply {
    ALL_INCLUSIVE(1), BREAKFAST(2), BREAKFAST_AND_LUNCH(3);
    private int id;

    public int getId() {
        return id;
    }

    Supply(int id) {
        this.id = id;
    }
}
