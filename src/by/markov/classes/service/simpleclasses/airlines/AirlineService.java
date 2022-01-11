package by.markov.classes.service.simpleclasses.airlines;

import by.markov.classes.simpleclasses.airlines.Airline;
import by.markov.classes.simpleclasses.airlines.Day;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineService {

    public void getMenu(Airline[] airlines) {
        int choosing;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - print flights of destination\n2 - print flights of week day\n3 - print flights of week day with your time");
            choosing = input.nextInt();
            switch (choosing) {
                case 1:
                    printFlightsWithDestination(airlines);
                    break;
                case 2:
                    printFlightsWithUserDayOfWeek(airlines);
                    break;
                case 3:
                    printFlightsWithUserDayAndTime(airlines);
                    break;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void printFlight(Airline[] airlines) {
        for (Airline airline : airlines) {
            System.out.println(airline.toString());
        }
    }

    public void printFlightsWithDestination(Airline[] airlines) {
        String userDestination;
        Scanner scannerOfDestination = new Scanner(System.in);
        try {
            System.out.println("Enter destination: ");
            userDestination = scannerOfDestination.nextLine();
            for (Airline airline : airlines) {
                if (airline.getDestination().equalsIgnoreCase(userDestination)) {
                    System.out.println(airline.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("The destination is missing or incorrect input.");
        }
        scannerOfDestination.close();
    }

    public void printFlightsWithUserDayOfWeek(Airline[] airlines) {
        String userDayOfWeek;
        Scanner scannerOfDay = new Scanner(System.in);
        try {
            System.out.println("Enter day of week: ");
            userDayOfWeek = scannerOfDay.nextLine();
            for (Airline airline : airlines) {
                for (Day day : airline.getDepartureDay()) {
                    if (userDayOfWeek.equalsIgnoreCase(day.toString())) {
                        System.out.println(airline.toString());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("The day of week is missing or incorrect input.");
        }
        scannerOfDay.close();
    }

    public void printFlightsWithUserDayAndTime(Airline[] airlines) {
        final String PATTERN_OF_TIME = "HH:mm";
        String userDayOfWeek;
        String userTime;
        Date userDate;
        try {
            SimpleDateFormat format = new SimpleDateFormat(PATTERN_OF_TIME);
            Scanner scannerOfDay = new Scanner(System.in);
            System.out.println("Enter day of week: ");
            userDayOfWeek = scannerOfDay.nextLine();
            Scanner scannerOfTime = new Scanner(System.in);
            System.out.println("Enter time in format hh:mm :");
            userTime = scannerOfTime.nextLine();
            userDate = format.parse(userTime);
            for (Airline airline : airlines) {
                for (Day day : airline.getDepartureDay()) {
                    if (airline.getDate().after(userDate) && userDayOfWeek.equalsIgnoreCase(day.toString())) {
                        System.out.println(airline.toString());
                    }
                }
            }
            scannerOfDay.close();
        } catch (Exception e) {
            System.out.println("The day of week is missing or incorrect input.");
        }
    }
}
