package by.markov.classes.aggregationandcomposition.car;

public class Car {
    private String modelOfCar;
    private String color;
    private Wheel wheel;
    private Engine engine;

    public Car(String modelOfCar, String color, Wheel wheel, Engine engine) {
        this.modelOfCar = modelOfCar;
        this.color = color;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car " + modelOfCar + "| Color: " + color + "| Engine: " + engine + "| Wheel: " + wheel;
    }
}
