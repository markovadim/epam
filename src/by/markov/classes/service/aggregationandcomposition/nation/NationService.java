package by.markov.classes.service.aggregationandcomposition.nation;

import by.markov.classes.aggregationandcomposition.nation.Nation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NationService {
    public void getMenu(ArrayList<Nation> nations) {
        int choosing;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - print capital\n2 - print print regions\n3 - print area of nation");
            choosing = input.nextInt();
            switch (choosing) {
                case 1:
                    printCapital(nations);
                    break;
                case 2:
                    printRegions(nations);
                    printCountOfRegions(nations);
                    break;
                case 3:
                    getAreaOfNation(nations);
                    break;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void printCapital(ArrayList<Nation> nations) {
        for (Nation nation : nations) {
            if (nation.getTown().isCapital()) {
                System.out.println(nation.getTown().getName() + " - столица государства " + nation.getName());
            }
        }
    }

    public void printNations(ArrayList<Nation> nations) {
        for (Nation nation : nations) {
            System.out.println(nation);
        }
    }

    public ArrayList<Nation> printCountOfRegions(ArrayList<Nation> nations) {
        nations.sort(new Comparator<>() {
            @Override
            public int compare(Nation o1, Nation o2) {
                return o1.getRegion().getName().compareTo(o2.getRegion().getName());
            }
        });
        int countOfRegion = 0;
        String nameOfCurrentRegion = null;
        for (Nation nation : nations) {
            if (nation.getRegion().getName().equals(nameOfCurrentRegion)) {
                continue;
            } else {
                countOfRegion++;
                nameOfCurrentRegion = nation.getRegion().getName();
            }
        }
        System.out.println("Количество областей государства: " + countOfRegion);
        return nations;
    }

    public void getAreaOfNation(ArrayList<Nation> nations) {
        int areaOfNation = 0;
        String nameOfCurrentRegion = null;
        for (Nation nation : nations) {
            if (nation.getRegion().getName().equals(nameOfCurrentRegion)) {
                continue;
            } else {
                areaOfNation += nation.getRegion().getArea();
                nameOfCurrentRegion = nation.getRegion().getName();
            }
        }
        System.out.println("Площадь государства: " + areaOfNation);
    }

    public ArrayList<Nation> printRegions(ArrayList<Nation> nations) {
        nations.sort(new Comparator<>() {
            @Override
            public int compare(Nation o1, Nation o2) {
                return o1.getRegion().getName().compareTo(o2.getRegion().getName());
            }
        });
        String nameOfCurrentRegion = null;
        for (Nation nation : nations) {
            if (nation.getRegion().getName().equals(nameOfCurrentRegion)) {
                continue;
            } else {
                System.out.println(nation.getRegion().getName());
                nameOfCurrentRegion = nation.getRegion().getName();
            }
        }
        return nations;
    }
}
