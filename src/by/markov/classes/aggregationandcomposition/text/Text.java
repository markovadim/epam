package by.markov.classes.aggregationandcomposition.text;

public class Text extends Sentence {
    private String tittle;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Text() {
    }

    public Text(String firstName, String lastName, String patronymic, String tittle) {
        super(firstName, lastName, patronymic);
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return tittle + '\n' + getFirstName() + " " + getLastName() + " " + getPatronymic();
    }
}
