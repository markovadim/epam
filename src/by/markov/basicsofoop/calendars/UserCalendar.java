package by.markov.basicsofoop.calendars;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserCalendar extends GregorianCalendar {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public UserCalendar(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }


    public class Printer {

        private int userMonth;

        public void printWeekends(UserCalendar userCalendar) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the month number for print holidays: ");

            userMonth = scanner.nextInt();
            userCalendar.set(Calendar.MONTH, userMonth);

            for (int i = 0; i < userCalendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
                userCalendar.set(Calendar.DAY_OF_MONTH, i);

                if ((userCalendar.get(Calendar.DAY_OF_WEEK) == SATURDAY) || (userCalendar.get(Calendar.DAY_OF_WEEK) == SUNDAY)) {
                    System.out.println(userCalendar.getTime() + " - day off");
                }
            }
        }
    }
}
