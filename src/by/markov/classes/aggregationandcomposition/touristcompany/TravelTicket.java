package by.markov.classes.aggregationandcomposition.touristcompany;

public class TravelTicket {
    private Type type;
    private String land;
    private Transport transport;
    private Supply supply;
    private int days;
    private int price;

    public TravelTicket(Type type, String land, Transport transport, Supply supply, int days, int price) {
        this.type = type;
        this.land = land;
        this.transport = transport;
        this.supply = supply;
        this.days = days;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public String getLand() {
        return land;
    }

    public Transport getTransport() {
        return transport;
    }

    public Supply getSupply() {
        return supply;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Travel type: " + type + "| land: " + land + "| transport: " + transport + "| supply: " + supply + "| days: " + days + "| price: $" + price;
    }
}
