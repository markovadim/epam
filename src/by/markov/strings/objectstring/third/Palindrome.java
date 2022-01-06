package by.markov.strings.objectstring.third;
//Проверить,является ли заданное слово полиндромом

public class Palindrome {

    public boolean getRes(String word) {
        boolean res = true;
        if (word.length() % 2 == 0) {
            System.out.println("Not Palindrome");
            return false;
        } else {
            word.toLowerCase();
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] == arr[arr.length - 1 - i]) {
                    res = true;
                } else {
                    System.out.println("not palindrome");
                    return false;
                }
            }
        }
        if (res) {
            System.out.println("Palindrome!");
            return res;
        } else return false;
    }
}
