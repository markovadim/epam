package by.markov.classes.aggregationandcomposition.car;

public class Engine {
    private String fuelType;
    private int power;
    private boolean isWorkable;

    public Engine(String fuelType, int power, boolean isWorkable) {
        this.fuelType = fuelType;
        this.power = power;
        this.isWorkable = isWorkable;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        isWorkable = workable;
    }

    @Override
    public String toString() {
        if (isWorkable) {
            return fuelType + ", power: " + power + " kWt";
        } else {
            return "Engine is not workable";
        }
    }
}
