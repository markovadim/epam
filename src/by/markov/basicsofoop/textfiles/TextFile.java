package by.markov.basicsofoop.textfiles;

import java.io.File;

public class TextFile extends File {
    private Directory directory;
    private String fileName;
    private String fileExtension;

    public TextFile(Directory parent, String fileName) {
        super(parent.getDirectory(), fileName);
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Directory getDirectory() {
        return directory;
    }

    public String getName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
