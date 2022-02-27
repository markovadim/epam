package by.markov.basicsofoop.dragons;

import by.markov.basicsofoop.services.dragons.BuyTreasures;
import by.markov.basicsofoop.services.dragons.ReadTreasures;
import by.markov.basicsofoop.services.dragons.ShowTreasures;
import by.markov.basicsofoop.services.dragons.RecordingTreasures;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        RecordingTreasures recordingTreasure = new RecordingTreasures();
//        recordingTreasure.writeTreasures();

        ReadTreasures readTreasures = new ReadTreasures();

        Dragon dragon1 = new Dragon("Kesha", 430, DragonType.DIAMOND_WINGED, DragonColor.BLACK);

        Cave miami = new Cave("Miami", dragon1, readTreasures.readNameOfTreasures(), readTreasures.readTreasuresPrice());

        ShowTreasures showTreasures = new ShowTreasures();
        showTreasures.showTreasures(miami);
        showTreasures.showTheMostExpensiveTreasure(miami);

        BuyTreasures buyTreasures = new BuyTreasures();
        buyTreasures.buyTreasures(miami);
    }
}
