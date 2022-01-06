package by.markov.strings.arrayofstring.first;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"helloWorld","helloJava", "helloMyFriends"};
        CamelSnake camelSnake = new CamelSnake();
        camelSnake.camelToSnake(array);
    }
}
