package by.markov.classes.aggregationandcomposition.nation;

public class Town {
    private String name;
    private int population;
    private boolean isCapital;

    public Town(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public Town(String name, int population, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        if (isCapital) {
            return name + " (столица), население: " + population + "тыс.чел";
        } else {
            return name + ", население: " + population + "тыс.чел";
        }
    }
}
