package by.markov.classes.service.aggregationandcomposition.touristcompany;

import by.markov.classes.aggregationandcomposition.touristcompany.TravelTicket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TouristCompanyService {

    public void getMenu(ArrayList<TravelTicket> travelTickets) {
        int choosing;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1 - Печать все туристические путевки\n2 - Подбор путевки");
            choosing = scanner.nextInt();
            switch (choosing) {
                case 1:
                    printTickets(travelTickets);
                    break;
                case 2:
                    getTravelTickets(travelTickets);
                    break;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void printTickets(ArrayList<TravelTicket> travelTickets) {
        for (TravelTicket ticket : travelTickets) {
            System.out.println(ticket);
        }
    }

    public ArrayList<TravelTicket> getTravelTickets(ArrayList<TravelTicket> travelTickets) {
        int transportType, foodType, days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Travel Company! Выберите тип желаемого транспорта: Самолет, Автобус либо Автомобиль (1,2 либо 3):");
        transportType = scanner.nextInt();
        System.out.println("Выберите тип желаемого питания: Все включено, Завтраки либо Завтрак + обед (1,2 либо 3):");
        foodType = scanner.nextInt();
        System.out.println("Выберите желаемое количество дней (не менее):");
        days = scanner.nextInt();
        ArrayList<TravelTicket> listTravel = new ArrayList<>();
        for (TravelTicket travelticket : travelTickets) {
            if ((travelticket.getTransport().getId() == transportType) && (travelticket.getDays() >= days) && (travelticket.getSupply().getId() == foodType)) {
                listTravel.add(travelticket);
                System.out.println(travelticket);
            }
        }
        userSort(listTravel);
        return listTravel;
    }

    public ArrayList<TravelTicket> userSort(ArrayList<TravelTicket> travelTickets) {
        int sortVariant;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сортировать по количеству дней, нажмите 1");
        System.out.println("Сортировать по типу отдыха, нажмите 2");
        System.out.println("Сортировать по цене, нажмите 3:");
        sortVariant = scanner.nextInt();
        if (sortVariant == 1) {
            sortOfDays(travelTickets);
            printTickets(travelTickets);
        } else if (sortVariant == 2) {
            sortOfType(travelTickets);
            printTickets(travelTickets);
        } else if (sortVariant == 3) {
            sortOfPrice(travelTickets);
            printTickets(travelTickets);
        } else {
            System.out.println("Incorrect input.");
        }
        return travelTickets;
    }

    public ArrayList<TravelTicket> sortOfDays(ArrayList<TravelTicket> travelTickets) {
        travelTickets.sort(new Comparator<TravelTicket>() {
            @Override
            public int compare(TravelTicket o1, TravelTicket o2) {
                return o1.getDays() - o2.getDays();
            }
        });
        return travelTickets;
    }

    public ArrayList<TravelTicket> sortOfType(ArrayList<TravelTicket> travelTickets) {
        travelTickets.sort(new Comparator<TravelTicket>() {
            @Override
            public int compare(TravelTicket o1, TravelTicket o2) {
                return o2.getType().toString().compareTo(o2.getType().toString());
            }
        });
        return travelTickets;
    }

    public ArrayList<TravelTicket> sortOfPrice(ArrayList<TravelTicket> travelTickets) {
        travelTickets.sort(new Comparator<TravelTicket>() {
            @Override
            public int compare(TravelTicket o1, TravelTicket o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return travelTickets;
    }
}
