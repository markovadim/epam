package by.markov.basicsofoop.textfiles;

import by.markov.basicsofoop.services.files.Builder;
import by.markov.basicsofoop.services.files.Creator;
import by.markov.basicsofoop.services.files.Printer;
import by.markov.basicsofoop.services.files.Updater;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Directory dir = new Directory("C:\\Users\\DELL\\IdeaProjects\\vibe");
        String fileName = "test.txt";
        String fileExtension = ".txt";

        TextFile file = new TextFile(dir, fileName);

        Creator creator = new Creator();
        creator.createTextFile(file);

        Builder builder = new Builder();
        builder.buildText(file);

        Printer printer = new Printer();
        printer.printTextFile(file);

        Updater updater = new Updater();
        updater.updateTextFile(fileExtension, file);
    }
}
