package by.markov.basicsofoop.services.files;

import by.markov.basicsofoop.textfiles.TextFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Updater {
    public void updateTextFile(String fileExtension, TextFile file) throws IOException {
        String newName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new name for a text file: ");
        newName = scanner.nextLine() + fileExtension;
        File newFile = new File(newName);
        file.renameTo(newFile);
        file.setFileName(newName);
        System.out.println("The File is renamed: " + file.getName());
    }
}
