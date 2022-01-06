package by.markov.strings.objectstring.fourth;
//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”

public class Cake {

    private String word = "информатика";

    public String getWord() {
        String newWord = word.substring(7, 8);
        newWord = newWord.concat(word.substring(3, 5)).concat(word.substring(7, 8));
        System.out.println(newWord);
        return newWord;
    }
}
