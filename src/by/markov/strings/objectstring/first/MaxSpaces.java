package by.markov.strings.objectstring.first;
//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем

public class MaxSpaces {

    public int getCount(String str) {
        int maxSpace = 0, currentMax = 0;
        char[] arr = str.toCharArray();
        for (char s : arr) {
            if (s == ' ') {
                currentMax++;
                if (currentMax > maxSpace) maxSpace = currentMax;
            } else currentMax = 0;
        }
        System.out.println(maxSpace);
        return maxSpace;
    }
}
