package by.markov.strings.objectstring.nineth;
//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.

import java.util.Scanner;

public class CounterOfSymbol {

    public int getRes() {
        int lower = 0, upper = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.UnicodeBlock.of(str.charAt(i)).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                if (Character.isLowerCase(str.charAt(i))) lower++;
                if (Character.isUpperCase(str.charAt(i))) upper++;
            }
        }
        System.out.println("UpperCase :" + upper + '\n' + "LowerCase :" + lower);
        return lower + upper;
    }
}
