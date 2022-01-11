package by.markov.classes.service.aggregationandcomposition.text;

import by.markov.classes.aggregationandcomposition.text.Sentence;
import by.markov.classes.aggregationandcomposition.text.Text;

public class TextService {

    public String createSentence(Sentence sentence) {
        return sentence.getFirstName() + " " + sentence.getLastName() + " " + sentence.getPatronymic();
    }

    public String createText(Text text, Sentence sentence) {
        return text.getTittle() + '\n' + createSentence(sentence);
    }

    public void printTittle(Text text) {
        System.out.println(text.getTittle());
    }

    public void printText(Text text) {
        System.out.println(text);
    }
}
