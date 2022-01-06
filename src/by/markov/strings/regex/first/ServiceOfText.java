package by.markov.strings.regex.first;
//Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceOfText {

    public void getService(String line) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - Сортировка абзацев по количеству предложений" +
                    "\n2 - Сортировка в каждом предложении слов по длине" +
                    "\n3 - Сортировка лексем в предложении по убыванию количества заданного символа");
            int operation = input.nextInt();
            switch (operation) {
                case 1:
                    sortOfPart(line);
                    break;
                case 2:
                    sortOfWords(line);
                    break;
                case 3:
                    sortOfLexeme(line);
                    break;
                default:
                    System.out.println("Operation not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input.");
        }
    }

    public void sortOfPart(String line) {
        Pattern pattern = Pattern.compile("\\t");
        String[] paragraph = pattern.split(line);
        int[] sentenceCount = new int[paragraph.length];

        pattern = Pattern.compile("[\\.!?]+");
        for (int i = 0; i < paragraph.length; i++) {
            Matcher matcher = pattern.matcher(paragraph[i]);
            while (matcher.find()) {
                sentenceCount[i]++;
            }
        }

        boolean swapping = true;
        while (swapping) {
            swapping = false;

            for (int i = 1; i < paragraph.length; i++) {
                if (sentenceCount[i] < sentenceCount[i - 1]) {
                    int tempInt = sentenceCount[i];
                    sentenceCount[i] = sentenceCount[i - 1];
                    sentenceCount[i - 1] = tempInt;

                    String swapStr = paragraph[i];
                    paragraph[i] = paragraph[i - 1];
                    paragraph[i - 1] = swapStr;

                    swapping = true;
                }
            }
        }
        for (int i = 0; i < paragraph.length; i++) {
            System.out.println("\t" + paragraph[i].trim() + "\n(" + sentenceCount[i] + " предложения)\n");
        }

    }

    public void sortOfWords(String line) {
        Pattern pattern = Pattern.compile("[A-Z].*?[\\.!?]+");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            String sentence = line.substring(matcher.start(), matcher.end());
            Pattern splitPattern = Pattern.compile("\\W+");
            String[] words = splitPattern.split(sentence);

            boolean swapping = true;
            while (swapping) {
                swapping = false;

                for (int i = 1; i < words.length; i++) {
                    if (words[i].length() < words[i - 1].length()) {
                        String swapStr = words[i];
                        words[i] = words[i - 1];
                        words[i - 1] = swapStr;
                        swapping = true;
                    }
                }
            }
            System.out.println(Arrays.toString(words));
        }
    }

    public void sortOfLexeme(String line) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите символ:");
        String symbol = input.nextLine();

        Pattern pattern = Pattern.compile("[A-Z].*?[\\.!?]+");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            String sentence = line.substring(matcher.start(), matcher.end());
            Pattern splitPattern = Pattern.compile("\\W+");
            String[] words = splitPattern.split(sentence);

            boolean needSwap = true;
            while (needSwap) {
                needSwap = false;

                for (int i = 1; i < words.length; i++) {
                    Pattern pat = Pattern.compile(symbol);
                    Matcher mat1 = pat.matcher(words[i]);
                    Matcher mat2 = pat.matcher(words[i - 1]);
                    int symbolCount1 = 0;
                    int symbolCount2 = 0;

                    while (mat1.find()) {
                        symbolCount1++;
                    }
                    while (mat2.find()) {
                        symbolCount2++;
                    }

                    if (symbolCount1 > symbolCount2) {
                        String swapStr = words[i];
                        words[i] = words[i - 1];
                        words[i - 1] = swapStr;
                        needSwap = true;
                    } else if (symbolCount1 == symbolCount2) {
                        if (compareWords(words[i - 1], words[i])) {
                            String swapStr = words[i];
                            words[i] = words[i - 1];
                            words[i - 1] = swapStr;
                            needSwap = true;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(words));
        }
    }

    public static boolean compareWords(String firstWord, String secondWord) {
        boolean b = false;
        int length = 0;
        if (firstWord.length() < secondWord.length()) {
            length = firstWord.length();
        } else {
            length = secondWord.length();
        }
        for (int i = 0; i < length; i++) {
            if (firstWord.toLowerCase().charAt(i) > secondWord.toLowerCase().charAt(i)) {
                b = true;
                break;
            } else if (firstWord.toLowerCase().charAt(i) < secondWord.toLowerCase().charAt(i)) {
                break;
            }
        }
        return b;
    }
}
