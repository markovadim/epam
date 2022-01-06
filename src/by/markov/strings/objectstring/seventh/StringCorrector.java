package by.markov.strings.objectstring.seventh;
//. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef"

import java.util.Scanner;

public class StringCorrector {

    public String getStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String strSecond = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str = str.replaceAll("\\s+", "");          //delete space
            }
            if (str.charAt(i - 1) == str.charAt(i) && i != 0) {
                continue;
            }

            strSecond = strSecond + str.charAt(i);
        }
        System.out.println(strSecond);
        return strSecond;
    }
}
