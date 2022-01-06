package by.markov.strings.arrayofstring.first;
// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class CamelSnake {

    public void camelToSnake(String[] array) {
        for (String word : array) {
            String result = "";
            char c = word.charAt(0);
            result = result + Character.toLowerCase(c);
            for (int i = 1; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result += "_" + Character.toLowerCase(ch);
                } else result += Character.toLowerCase(ch);
            }
            System.out.println(result);
        }
    }
}
