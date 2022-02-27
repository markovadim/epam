package by.markov.basicsofoop.services.dragons;

import by.markov.basicsofoop.dragons.Cave;

public class ShowTreasures {
    public void showTreasures(Cave cave) {
        for (int i = 0; i < cave.getNameOfTreasures().length; i++) {
            System.out.println(cave.getNameOfTreasures()[i] + " - $" + cave.getTreasuresThePrice()[i]);
        }
    }

    public void showTheMostExpensiveTreasure(Cave cave) {
        int maxPrice = cave.getTreasuresThePrice()[0];
        String nameOfTreasure = cave.getNameOfTreasures()[0];
        for (int i = 0; i < cave.getTreasuresThePrice().length; i++) {
            if (cave.getTreasuresThePrice()[i] > maxPrice) {
                maxPrice = cave.getTreasuresThePrice()[i];
                nameOfTreasure = cave.getNameOfTreasures()[i];
            }
        }
        System.out.println("The most expensive treasure is: " + '\n' + nameOfTreasure + " - $" + maxPrice);
    }
}
