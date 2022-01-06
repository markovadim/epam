package by.markov.strings.objectstring.fifth;
//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”

public class CounterOfLetter {

    public int getCount(String str) {
        int count = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if ((symbol == 'a') | (symbol == 'а')) count++;      //english or russian
        }
        System.out.println("a: " + count);
        return count;
    }
}
