package by.markov.basicsofoop.services.dragons;

import by.markov.basicsofoop.services.files.Builder;
import by.markov.basicsofoop.services.files.Creator;
import by.markov.basicsofoop.textfiles.Directory;
import by.markov.basicsofoop.textfiles.TextFile;

import java.io.IOException;

public class RecordingTreasures {
    private final String DIRECTORY = System.getProperty("user.dir");
    private final String FILE_FOR_NAME_OF_TREASURES = "name_of_treasures.txt";
    private final String FILE_FOR_PRICE_OF_TREASURES = "price_of_treasures.txt";

    public void writeTreasures() throws IOException {
        Directory directory = new Directory(DIRECTORY);
        TextFile fileForNameOfTreasures = new TextFile(directory, FILE_FOR_NAME_OF_TREASURES);

        Creator creator = new Creator();
        creator.createTextFile(fileForNameOfTreasures);

        int amountTreasures = 0;
        System.out.println("Recording treasures:");
        Builder builder = new Builder();
        while (amountTreasures < 10) {
            builder.buildText(fileForNameOfTreasures);
            amountTreasures++;
        }
        System.out.println("Treasures recorded.");

        writeTreasuresPrice();
    }

    public void writeTreasuresPrice() throws IOException {
        Directory directory = new Directory(DIRECTORY);
        TextFile fileForPriceOfTreasures = new TextFile(directory, FILE_FOR_PRICE_OF_TREASURES);

        Creator creator = new Creator();
        creator.createTextFile(fileForPriceOfTreasures);

        int amountTreasures = 0;
        System.out.println("Recording the price:");
        Builder builder = new Builder();
        while (amountTreasures < 10) {
            builder.buildText(fileForPriceOfTreasures);
            amountTreasures++;
        }
        System.out.println("Treasures price recorded.");
    }
}
