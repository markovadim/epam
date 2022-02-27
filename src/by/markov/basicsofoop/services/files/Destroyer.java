package by.markov.basicsofoop.services.files;

import by.markov.basicsofoop.textfiles.TextFile;

public class Destroyer {
    public void deleteFile(TextFile file) {
        if (file.exists()) {
            file.delete();
        }
    }
}
