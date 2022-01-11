package by.markov.classes.service.simpleclasses.trains;

import by.markov.classes.simpleclasses.trains.Train;

import java.util.*;

public class TrainService {

    public void getMenu(Train[] trains) {
        int choose;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - print information of train\n2 - sort trains by destination\n3 - sort trains by number");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    printInformationOfTrain(trains);
                    break;
                case 2:
                    sortByName(trains);
                    break;
                case 3:
                    sortByNumbers(trains);
                    break;
                default:
                    System.out.println("Operation not found.");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }

    public void printInformationOfTrain(Train[] arrayOfTrain) {
        int numberOfTrain;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Train:");
        numberOfTrain = scanner.nextInt();

        for (Train train : arrayOfTrain) {
            if (train.getNumber() == numberOfTrain) System.out.println(train);
        }

        scanner.close();
    }

    public Train[] sortByName(Train[] arrayOfTrain) {
        Arrays.sort(arrayOfTrain, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                int tmp;
                if (o1.getDestination().equalsIgnoreCase(o2.getDestination())) {
                    tmp = sortByDate(o1.getTime(), o2.getTime());
                } else {
                    tmp = o1.getDestination().compareTo(o2.getDestination());
                }
                return tmp;
            }
        });
        return arrayOfTrain;
    }

    public int sortByDate(Date date1, Date date2) {
        if (date1.before(date2)) {
            return -1;
        } else return 1;
    }

    public Train[] sortByNumbers(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });
        return trains;
    }
}
