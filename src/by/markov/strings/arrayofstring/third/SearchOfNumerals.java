package by.markov.strings.arrayofstring.third;
//В строке найти количество цифр

public class SearchOfNumerals {

    public int getAmountOfNumerals(String str) {
        int count = 0;
        System.out.println("Default string:" + '\n' + str);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                count++;
        }
        System.out.println(count + " numerals" + '\n');
        return count;
    }
}
