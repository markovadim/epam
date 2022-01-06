package by.markov.strings.objectstring.tenth;

public class Main {
    public static void main(String[] args) {
        String line = new String("Строка X состоит из нескольких предложений, каждое из которых кончается точкой. восклицательным! или вопросительным? \n" +
                "знаком.\n\tОпределить количество предложений в строке X.");
        LineOfText lineOfText = new LineOfText();
        lineOfText.getRes(line);
    }
}
