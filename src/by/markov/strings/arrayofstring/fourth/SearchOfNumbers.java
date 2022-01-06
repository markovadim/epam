package by.markov.strings.arrayofstring.fourth;
//В строке найти количество чисел

public class SearchOfNumbers {

    public int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.isDigit(str.charAt(i)) & !Character.isDigit(str.charAt(i + 1)))) count++;
            else continue;
        }
        System.out.println(count);
        return count;
    }
}
