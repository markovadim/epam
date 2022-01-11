package by.markov.classes.simpleclasses.airlines;

import by.markov.classes.service.simpleclasses.airlines.AirlineService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Airplane boing777 = new Airplane("Boing 777", 235);
        Airplane boing767 = new Airplane("Boing 767", 386);
        Airplane boing737 = new Airplane("Boing 737", 114);
        Airplane airbusA320 = new Airplane("Airbus A 320", 259);
        Airplane airbusA310 = new Airplane("Airbus A 310", 183);

        Airline warsaw = new Airline(111, "Warshava", new Date(13131313L), new Day[]{Day.SATURDAY, Day.FRIDAY}, boing777);
        Airline vienna = new Airline(657, "Vienna", new Date(1564323L), new Day[]{Day.FRIDAY, Day.SATURDAY, Day.MONDAY}, boing737);
        Airline helsinki = new Airline(434, "Helsinki", new Date(1222323L), new Day[]{Day.SUNDAY, Day.FRIDAY}, boing767);
        Airline brussels = new Airline(663, "Brussels", new Date(1772323L), new Day[]{Day.THURSDAY, Day.WEDNESDAY}, boing767);
        Airline budapest = new Airline(321, "Budapest", new Date(3272323L), new Day[]{Day.SUNDAY, Day.FRIDAY}, airbusA310);
        Airline belgrade = new Airline(444, "Belgrade", new Date(4572323L), new Day[]{Day.SATURDAY, Day.SUNDAY}, airbusA320);
        Airline stockholm = new Airline(212, "Stockholm", new Date(6572323L), new Day[]{Day.SATURDAY, Day.FRIDAY, Day.MONDAY}, boing777);
        Airline[] airlines = new Airline[]{warsaw, vienna, helsinki, brussels, budapest, belgrade, stockholm};

        AirlineService service = new AirlineService();
        service.getMenu(airlines);


    }
}
