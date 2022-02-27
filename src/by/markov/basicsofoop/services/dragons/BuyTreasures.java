package by.markov.basicsofoop.services.dragons;

import by.markov.basicsofoop.dragons.Cave;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuyTreasures {
    private int amountMoney;
    private String treasuresOfUser = "";

    public void buyTreasures(Cave cave) {
        int currentTreasure;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("How much is your money?");
            amountMoney = scanner.nextInt();
            System.out.println("The treasures:");
            for (int i = 0; i < cave.getNameOfTreasures().length; i++) {
                System.out.println(i + " - " + cave.getNameOfTreasures()[i] + " - $" + cave.getTreasuresThePrice()[i]);
            }
        } catch (InputMismatchException exception) {
            System.out.println(scanner.nextLine() + " - incorrect input.");
        }
        try {
            while (amountMoney > 0) {
                System.out.println("You have $" + amountMoney + ". What treasure do you want to buy?");
                currentTreasure = scanner.nextInt();
                if (cave.getTreasuresThePrice()[currentTreasure] <= amountMoney) {
                    amountMoney -= cave.getTreasuresThePrice()[currentTreasure];
                    treasuresOfUser += cave.getNameOfTreasures()[currentTreasure] + " ";
                } else {
                    System.out.println("Not enough money..");
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println(scanner.nextLine() + " - incorrect input.");
            treasuresOfUser = "None a treasures";
        }
        System.out.println("Your treasures: " + treasuresOfUser);
    }
}
