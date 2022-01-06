package by.markov.strings.regex.second;
//Дана строка, содержащая следующий текст (xml-документ):
//notes.xml
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
//нельзя

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyzer {

    public String readXml() throws IOException {
        String directory = "src/by/markov/strings/regex/resources";
        String nameOfXmlFile = "notes.xml";

        String line = "";

        File file = new File(directory, nameOfXmlFile);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            line += bufferedReader.readLine() + '\n';
        }
        bufferedReader.close();

        parseText(line);

        return line;
    }

    public static void parseText(String line) {
        Pattern open = Pattern.compile("<[a-z]+>");
        Pattern close = Pattern.compile("</\\w.+?>");
        Pattern text = Pattern.compile(">(.+?)<");
        Pattern empty = Pattern.compile("<\\w.+?/>");

        String[] lines = line.split("\n");

        for (String str : lines) {
            Matcher matcherOpen = open.matcher(str);
            Matcher matcherClose = close.matcher(str);
            Matcher matcherText = text.matcher(str);
            Matcher matcherEmpty = empty.matcher(str);

            if (matcherOpen.find()) {
                System.out.println(matcherOpen.group(0) + " - открытый тег");
            }
            if (matcherText.find()) {
                System.out.println(matcherText.group(1) + " - содежимое тега");
            }
            if (matcherClose.find()) {
                System.out.println(matcherClose.group(0) + " - закрытый тег");
            }
            if (matcherEmpty.find()) {
                System.out.println(matcherEmpty.group(0) + " - пустой тег");
            }
        }
    }
}