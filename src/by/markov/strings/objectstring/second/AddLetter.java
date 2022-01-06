package by.markov.strings.objectstring.second;
// строке вставить после каждого символа 'a' символ 'b'

public class AddLetter {

    public String getRes(String str) {
        String result = new String("");
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == 'a') {
                result += "aB";
            } else result += s;
        }
        System.out.println(result);
        return result;
    }
}
