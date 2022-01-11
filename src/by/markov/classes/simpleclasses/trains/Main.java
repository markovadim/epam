package by.markov.classes.simpleclasses.trains;

import by.markov.classes.service.simpleclasses.trains.TrainService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Train train1 = new Train(6103, "Gudogai", new Date(1633062600000L));
        Train train2 = new Train(6904, "Osipovichi", new Date(1633065060000L));
        Train train3 = new Train(680, "Vitebsk", new Date(1633048620000L));
        Train train4 = new Train(6803, "Baranovichi", new Date(1633062660000L));
        Train train5 = new Train(6006, "Orsha", new Date(1633062540000L));
        Train[] trains = new Train[]{train1, train2, train3, train4, train5};

        TrainService trainService = new TrainService();
        trainService.getMenu(trains);
    }
}
