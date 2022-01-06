package by.markov.strings.arrayofstring.fifth;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить

public class DeleteSpace {
    public String getStr(String str) {
        System.out.println("Default string: " + str);
        String str2 = str.replaceAll("\\s+", " ");
        System.out.println(str2.trim());
        return str2;
    }
}
