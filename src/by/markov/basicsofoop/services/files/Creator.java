package by.markov.basicsofoop.services.files;

import by.markov.basicsofoop.textfiles.TextFile;

import java.io.IOException;

public class Creator {
    public void createTextFile(TextFile file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        } else {
            System.out.println("File is created.");
        }
    }
}
