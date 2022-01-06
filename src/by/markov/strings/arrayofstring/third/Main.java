package by.markov.strings.arrayofstring.third;

public class Main {
    public static void main(String[] args) {
        String line = "Hello world!1 I have a 1 son. His number is 80336660066";
        SearchOfNumerals searchOfNumerals = new SearchOfNumerals();
        searchOfNumerals.getAmountOfNumerals(line);
    }
}
