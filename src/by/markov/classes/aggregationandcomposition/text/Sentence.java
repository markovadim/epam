package by.markov.classes.aggregationandcomposition.text;

public class Sentence extends Word {
    private String lastName;
    private String patronymic;

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sentence() {
    }

    public Sentence(String firstName, String lastName, String patronymic) {
        super(firstName);
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + lastName + " " + patronymic;
    }
}
