package by.markov.basicsofoop.services.files;

import by.markov.basicsofoop.textfiles.TextFile;

import java.awt.*;
import java.io.IOException;

public class Opener {
    public void openTextFile(TextFile file) {
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
        }
        try {
            desktop.open(file);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
