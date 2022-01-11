package by.markov.classes.aggregationandcomposition.car;

public class Wheel {
    private int diameter;
    private boolean isWorkable;

    public Wheel(int diameter, boolean isWorkable) {
        this.diameter = diameter;
        this.isWorkable = isWorkable;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
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
            return diameter + "' ";
        } else {
            return diameter + "' " + ", is not workable!";
        }
    }
}
