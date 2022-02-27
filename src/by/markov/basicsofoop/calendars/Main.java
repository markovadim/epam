package by.markov.basicsofoop.calendars;

import by.markov.basicsofoop.services.calendars.Creator;


public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        UserCalendar userCalendar = creator.createUserCalendar();
        System.out.println(userCalendar.getTime());

        UserCalendar.Printer printer = userCalendar.new Printer();
        printer.printWeekends(userCalendar);
    }
}
