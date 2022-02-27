package by.markov.basicsofoop.services.dragons;

import by.markov.basicsofoop.services.files.Printer;
import by.markov.basicsofoop.textfiles.Directory;
import by.markov.basicsofoop.textfiles.TextFile;

import java.io.IOException;
import java.util.Arrays;

public class ReadTreasures {
    private String nameOfTreasures[] = new String[10];
    private String[] treasuresPriceString = new String[10];
    private int[] treasuresPrice = new int[10];


    final String DIRECTORY = System.getProperty("user.dir");
    final String FILE_FOR_NAME_OF_TREASURES = "name_of_treasures.txt";
    final String FILE_FOR_PRICE_OF_TREASURES = "price_of_treasures.txt";


    public String[] readNameOfTreasures() throws IOException {
        Directory directory = new Directory(DIRECTORY);

        TextFile fileForNameOfTreasures = new TextFile(directory, FILE_FOR_NAME_OF_TREASURES);

        Printer printerNameOfTreasures = new Printer();
        printerNameOfTreasures.recordingTextFileInArray(fileForNameOfTreasures, nameOfTreasures);
        System.out.println("Names of treasures recorded in array:");
        System.out.println(Arrays.toString(nameOfTreasures));

        return nameOfTreasures;
    }

    public int[] readTreasuresPrice() throws IOException {
        Directory directory = new Directory(DIRECTORY);

        TextFile fileForNameOfTreasures = new TextFile(directory, FILE_FOR_PRICE_OF_TREASURES);

        Printer printerNameOfTreasures = new Printer();
        printerNameOfTreasures.recordingTextFileInArray(fileForNameOfTreasures, treasuresPriceString);

        for (int i = 0; i < treasuresPrice.length; i++) {
            treasuresPrice[i] = Integer.parseInt(treasuresPriceString[i]);
        }

        System.out.println("Treasures price recorded in array:");
        System.out.println(Arrays.toString(treasuresPrice));
        return treasuresPrice;
    }
}
