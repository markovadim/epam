package by.markov.strings.objectstring.fifth;

public class Main {
    public static void main(String[] args) {
        String line = new String("Hello. My name is Vadim. Name of my son is Nikita.");
        CounterOfLetter counterOfLetter = new CounterOfLetter();
        counterOfLetter.getCount(line);
    }
}
