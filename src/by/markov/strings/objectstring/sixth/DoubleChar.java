package by.markov.strings.objectstring.sixth;
//Из заданной строки получить новую, повторив каждый символ дважды

public class DoubleChar {
    public void getStr(String str) {
        StringBuilder newString = new StringBuilder("");
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            newString.append(symbol).append(symbol);
        }
        System.out.println(newString);
    }
}
