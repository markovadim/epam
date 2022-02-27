package by.markov.basicsofoop.services.files;

import by.markov.basicsofoop.textfiles.TextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {
    public void printTextFile(TextFile file) throws IOException, InterruptedException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
            Thread.sleep(1000);
        }
        bufferedReader.close();
    }

    public String[] recordingTextFileInArray(TextFile file, String[] array) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int i = 0;
        while (bufferedReader.ready()) {
            array[i] = bufferedReader.readLine();
            i++;
        }
        bufferedReader.close();
        return array;
    }
}
