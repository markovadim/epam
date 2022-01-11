package by.markov.classes.aggregationandcomposition.touristcompany;

import by.markov.classes.service.aggregationandcomposition.touristcompany.TouristCompanyService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TravelTicket travelTicket1 = new TravelTicket(Type.CRUISE, "Sweeden", Transport.BUS, Supply.BREAKFAST_AND_LUNCH, 7, 450);
        TravelTicket travelTicket2 = new TravelTicket(Type.SHOPPING, "Italy", Transport.CAR, Supply.BREAKFAST, 3, 210);
        TravelTicket travelTicket3 = new TravelTicket(Type.REST, "Egypt", Transport.AIRPLANE, Supply.ALL_INCLUSIVE, 8, 430);
        TravelTicket travelTicket4 = new TravelTicket(Type.CRUISE, "Norway", Transport.BUS, Supply.BREAKFAST_AND_LUNCH, 5, 430);
        TravelTicket travelTicket5 = new TravelTicket(Type.SHOPPING, "Switzeland", Transport.CAR, Supply.BREAKFAST, 3, 210);
        TravelTicket travelTicket6 = new TravelTicket(Type.REST, "Turkey", Transport.AIRPLANE, Supply.ALL_INCLUSIVE, 11, 650);
        TravelTicket travelTicket7 = new TravelTicket(Type.REST, "Turkey", Transport.AIRPLANE, Supply.BREAKFAST_AND_LUNCH, 5, 350);
        TravelTicket travelTicket8 = new TravelTicket(Type.CRUISE, "Iceland", Transport.BUS, Supply.BREAKFAST, 5, 270);
        TravelTicket travelTicket9 = new TravelTicket(Type.SHOPPING, "Spain", Transport.CAR, Supply.BREAKFAST, 2, 170);

        ArrayList<TravelTicket> travelTickets = new ArrayList<>();
        travelTickets.add(travelTicket1);
        travelTickets.add(travelTicket2);
        travelTickets.add(travelTicket3);
        travelTickets.add(travelTicket4);
        travelTickets.add(travelTicket5);
        travelTickets.add(travelTicket6);
        travelTickets.add(travelTicket7);
        travelTickets.add(travelTicket8);
        travelTickets.add(travelTicket9);

        TouristCompanyService touristCompanyService = new TouristCompanyService();
        touristCompanyService.getTravelTickets(travelTickets);
    }
}
