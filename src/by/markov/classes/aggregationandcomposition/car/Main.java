package by.markov.classes.aggregationandcomposition.car;

import by.markov.classes.service.aggregationandcomposition.car.CarService;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(17, true);

        Engine engineDiesel = new Engine("diesel", 100, true);
        Engine engineDiesel2 = new Engine("diesel", 100, false);

        Car vw = new Car("Volkswagen", "grey", wheel, engineDiesel);

        CarService service = new CarService();
        service.printModel(vw);
        service.drive(vw);
    }
}
