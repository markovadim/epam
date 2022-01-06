package by.markov.strings.objectstring.eighth;
// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

import java.util.Scanner;

public class MaxWord {

    public String getStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        int maxLength = 0;
        String wordRes = "";
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                wordRes = word;
            }
        }
        System.out.println(wordRes);
        return wordRes;
    }
}
