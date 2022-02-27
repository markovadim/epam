package by.markov.basicsofoop.services.files;

import by.markov.basicsofoop.textfiles.TextFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Builder {
    public void buildText(TextFile file) throws IOException {
        String newLine;
        FileWriter fileWriter = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new line for file:");
        newLine = scanner.nextLine();
        fileWriter.append(newLine + '\n');
        fileWriter.close();
    }

    public void buildText(TextFile file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(text + '\n');
        fileWriter.close();
    }

    public void rewriteText(TextFile file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.append(text + '\n');
        fileWriter.close();
    }
}
