package by.markov.basicsofoop.services.calendars;

import by.markov.basicsofoop.calendars.UserCalendar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Creator {

    public UserCalendar createUserCalendar() {
        UserCalendar userCalendar = null;
        try {
            int year;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Year: ");
            year = scanner.nextInt();

            userCalendar = new UserCalendar(year, 0, 1);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return userCalendar;
    }
}
