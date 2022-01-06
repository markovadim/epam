package by.markov.strings.objectstring.first;

public class Main {
    public static void main(String[] args) {
        String line = "Дан текст   (строка).     Найдите   наибольшее количество    подряд  пробелов.";
        MaxSpaces maxSpaces = new MaxSpaces();
        maxSpaces.getCount(line);
    }
}
