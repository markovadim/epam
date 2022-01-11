package by.markov.classes.aggregationandcomposition.text;

public class Word {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public Word() {
    }

    public Word(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName;
    }
}
