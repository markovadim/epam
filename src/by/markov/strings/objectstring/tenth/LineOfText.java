package by.markov.strings.objectstring.tenth;
//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

public class LineOfText {

    public int getRes(String str) {
        int getResult = 0;
        int countTab = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == '.') || (str.charAt(i) == '!') || (str.charAt(i) == '?')) {
                getResult++;
                if ((str.charAt(i + 1) == '\n') && (str.charAt(i + 2) == '\t')) {
                    countTab++;
                }
            }
        }
        System.out.println(getResult + " предложений");
        System.out.println(countTab + " абзацев");
        return getResult;
    }
}
