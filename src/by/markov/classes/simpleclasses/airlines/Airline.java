package by.markov.classes.simpleclasses.airlines;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Airline {
    private int flightNumber;
    private String destination;
    private Date date;
    private Day[] departureDay;
    private Airplane airplane;
    final String PATTERN_OF_TIME = "HH:mm z";

    public Airline(int flightNumber, String destination, Date date, Day[] departureDay, Airplane airplane) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.date = date;
        this.departureDay = departureDay;
        this.airplane = airplane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Day[] getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(Day[] departureDay) {
        this.departureDay = departureDay;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN_OF_TIME);
        return "Flight Number: " + flightNumber +
                "| Destination: " + destination +
                "| Time departure: " + simpleDateFormat.format(date) +
                "| Departure day: " + Arrays.toString(departureDay) +
                "| Airplane " + airplane;
    }
}
