package by.markov.basicsofoop.services.presents;

import by.markov.basicsofoop.presents.Box;
import by.markov.basicsofoop.presents.BoxSize;
import by.markov.basicsofoop.presents.Color;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoxCreator {
    private BoxSize boxSize;
    private Color color;
    private boolean bow;

    private Box box;

    public Box createBox() {
        int idBoxSize, idBoxColor, bowOrNotBow;
        System.out.println("Welcome to our present's shop!Choose your present!");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Choosing a box size.");
            showBoxes();
            idBoxSize = scanner.nextInt();

            System.out.println("Choosing a box color.");
            showColors();
            idBoxColor = scanner.nextInt();

            System.out.println("Add bow?\n1 - yes\n2 - no");
            bowOrNotBow = scanner.nextInt();

            BoxBuilderManager boxBuilderManager = new BoxBuilderManager();
            boxBuilderManager.setBoxSize(chooseBoxSize(idBoxSize)).setColor(chooseBoxColor(idBoxColor)).setBow(addBow(bowOrNotBow)).setPrice();
            box = boxBuilderManager.build();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return box;
    }

    public void showBoxes() {
        int counter = 1;
        for (BoxSize boxSize : BoxSize.values()) {
            System.out.println(boxSize + " - press " + counter);
            counter++;
        }
    }

    public BoxSize chooseBoxSize(int input) {
        switch (input) {
            case 1:
                boxSize = BoxSize.A6;
                break;
            case 2:
                boxSize = BoxSize.A5;
                break;
            case 3:
                boxSize = BoxSize.A4;
                break;
            case 4:
                boxSize = BoxSize.A3;
                break;
            default:
                System.out.println("Input is not correct.");
                boxSize = null;
                break;
        }
        return boxSize;
    }

    public void showColors() {
        int counter = 1;
        for (Color color : Color.values()) {
            System.out.println(color + " - press " + counter);
            counter++;
        }
    }

    public Color chooseBoxColor(int input) {
        switch (input) {
            case 1:
                color = Color.BLACK;
                break;
            case 2:
                color = Color.WHITE;
                break;
            case 3:
                color = Color.YELLOW;
                break;
            case 4:
                color = Color.GREEN;
                break;
            case 5:
                color = Color.BLUE;
                break;
            case 6:
                color = Color.RED;
                break;
            default:
                System.out.println("Input is not correct.");
                color = null;
        }
        return color;
    }

    public boolean addBow(int input) {
        if (input == 1) {
            return true;
        } else {
            return false;
        }
    }
}
