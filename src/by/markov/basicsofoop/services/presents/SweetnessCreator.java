package by.markov.basicsofoop.services.presents;

import by.markov.basicsofoop.presents.Sweetness;
import by.markov.basicsofoop.presents.SweetnessType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SweetnessCreator {
    private ArrayList<Sweetness> sweetnesses;

    public ArrayList<Sweetness> chooseSweetness() {
        sweetnesses = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String currentSweetness;
        boolean isNotZero = true;
        boolean isNotSweetness = false;

        showSweetnessType();

        try {
            while (isNotZero) {
                System.out.println("Choose a sweetness type for your present.\nExit from the choosing - press 0.");
                currentSweetness = scanner.nextLine();

                //check of exit
                if (currentSweetness.trim().equals("0")) {
                    isNotZero = false;
                } else {
                    for (SweetnessType sweetnessType : SweetnessType.values()) {
                        if (currentSweetness.equalsIgnoreCase(sweetnessType.toString())) {
                            sweetnesses.add(new Sweetness(sweetnessType));
                            isNotSweetness = false;
                            break;
                        } else {
                            isNotSweetness = true;
                        }
                    }
                    if (isNotSweetness) {
                        System.out.println(currentSweetness + " not found.");
                    }
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return sweetnesses;
    }

    public void showSweetnessType() {
        for (SweetnessType sweetnessType : SweetnessType.values()) {
            System.out.println(sweetnessType);
        }
    }
}
