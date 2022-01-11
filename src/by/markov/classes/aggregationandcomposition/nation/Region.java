package by.markov.classes.aggregationandcomposition.nation;

public class Region {
    private String name;
    private int numberOfRegion;
    private int area;

    public Region(String name, int numberOfRegion, int area) {
        this.name = name;
        this.numberOfRegion = numberOfRegion;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRegion() {
        return numberOfRegion;
    }

    public void setNumberOfRegion(int numberOfRegion) {
        this.numberOfRegion = numberOfRegion;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return name + ", номер региона: " + numberOfRegion + ", площадь области: " + area;
    }
}
