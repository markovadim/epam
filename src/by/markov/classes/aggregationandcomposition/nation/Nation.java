package by.markov.classes.aggregationandcomposition.nation;

public class Nation {
    private String name;
    private Region region;
    private District district;
    private Town town;

    public Nation(String name, Region region, District district, Town town) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Страна: " + name + ", Область/Край: " + region + ", Район: " + district + ", Город: " + town;
    }
}
