package by.markov.classes.aggregationandcomposition.text;

import by.markov.classes.service.aggregationandcomposition.text.TextService;

public class Main {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("Markov", "Vadim", "Sergeevich");

        Text text = new Text("Markov", "Vadim", "Sergeevich", "");
        text.setTittle("People");

        TextService service = new TextService();
        service.createSentence(sentence);
        service.printText(text);
    }
}
