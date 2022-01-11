package by.markov.classes.simpleclasses.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UsersTime {
    private final int MIN_OF_HOURS = 0;
    private final int MAX_OF_HOURS = 23;
    private final int MIN_OF_MINUTES = 0;
    private final int MAX_OF_MINUTES = 59;
    private final int MIN_OF_SECONDS = 0;
    private final int MAX_OF_SECONDS = 59;
    private final String FORMAT_DATE_PATTERN = "dd.MM.yyyy HH:mm z";

    public void startProgramTime() {
        int variantOfProgram;
        Scanner scannerOfVariantProgram = new Scanner(System.in);
        System.out.println("Get current time - press 1\nInstall your time - press 2\nThe time with a difference - press 3");
        variantOfProgram = scannerOfVariantProgram.nextInt();
        switch (variantOfProgram) {
            case 1:
                getCurrentTime();
                break;
            case 2:
                getProgramWithYourTime();
                break;
            case 3:
                getProgramWithChangesTime();
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
        scannerOfVariantProgram.close();
    }

    public void getCurrentTime() {
        SimpleDateFormat formatOfCurrentTime = new SimpleDateFormat(FORMAT_DATE_PATTERN);
        System.out.println("The current time: " + formatOfCurrentTime.format(new Date()));
    }

    public void getUsersHoursMinutesSeconds(int hours, int minutes, int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, seconds);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Users time: " + timeFormat.format(calendar.getTime()));
    }

    public void getProgramWithYourTime() {
        int scannerCurrentInput, userHours, userMinutes, userSeconds;
        Scanner scannerOfTime = new Scanner(System.in);
        System.out.println("Enter hours:");
        scannerCurrentInput = scannerOfTime.nextInt();
        if ((scannerCurrentInput < MIN_OF_HOURS) || (scannerCurrentInput > MAX_OF_HOURS)) {
            userHours = 0;
        } else {
            userHours = scannerCurrentInput;
        }
        System.out.println("Enter minutes:");
        scannerCurrentInput = scannerOfTime.nextInt();
        if ((scannerCurrentInput < MIN_OF_MINUTES) || (scannerCurrentInput > MAX_OF_MINUTES)) {
            userMinutes = 0;
        } else {
            userMinutes = scannerCurrentInput;
        }
        System.out.println("Enter seconds:");
        scannerCurrentInput = scannerOfTime.nextInt();
        if ((scannerCurrentInput < MIN_OF_SECONDS) || (scannerCurrentInput > MAX_OF_SECONDS)) {
            userSeconds = 0;
        } else {
            userSeconds = scannerCurrentInput;
        }
        getUsersHoursMinutesSeconds(userHours, userMinutes, userSeconds);
        scannerOfTime.close();
    }

    public void getProgramWithChangesTime() {
        Scanner scannerOfVariantOfChanges = new Scanner(System.in);
        System.out.println("If you want to change Hours, press 1" + '\n' + "If you want to change Minutes, press 2" + '\n' + "If you want to change Seconds, press 3");
        switch (scannerOfVariantOfChanges.nextInt()) {
            case 1:
                changeHours();
                break;
            case 2:
                changeMinutes();
                break;
            case 3:
                changeSeconds();
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }

    public void changeHours() {
        Calendar currentCalendar = new GregorianCalendar();
        Scanner scannerOfArithmeticOperation = new Scanner(System.in);
        System.out.println("Plus Hours - press 1" + '\n' + "Minus Hours - press 2:");
        switch (scannerOfArithmeticOperation.nextInt()) {
            case 1:
                System.out.println("Enter the difference: ");
                currentCalendar.add(Calendar.HOUR, scannerOfArithmeticOperation.nextInt());
                System.out.println(currentCalendar.getTime());
                break;
            case 2:
                System.out.println("Enter the difference: ");
                currentCalendar.add(Calendar.HOUR, -scannerOfArithmeticOperation.nextInt());
                System.out.println(currentCalendar.getTime());
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }

    public void changeMinutes() {
        Calendar currentCalendar = Calendar.getInstance();
        Scanner scannerOfArithmeticOperation = new Scanner(System.in);
        System.out.println("Plus Minutes - press 1" + '\n' + "Minus Minutes - press 2:");
        switch (scannerOfArithmeticOperation.nextInt()) {
            case 1:
                System.out.println("Enter the difference: ");
                currentCalendar.add(Calendar.MINUTE, scannerOfArithmeticOperation.nextInt());
                System.out.println(currentCalendar.getTime());
                break;
            case 2:
                System.out.println("Enter the difference: ");
                currentCalendar.add(Calendar.MINUTE, -scannerOfArithmeticOperation.nextInt());
                System.out.println(currentCalendar.getTime());
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }

    public void changeSeconds() {
        Calendar currentCalendar = Calendar.getInstance();
        Scanner scannerOfArithmeticOperation = new Scanner(System.in);
        System.out.println("Plus Seconds - press 1" + '\n' + "Minus Seconds - press 2:");
        switch (scannerOfArithmeticOperation.nextInt()) {
            case 1:
                System.out.println("Enter the difference: ");
                currentCalendar.add(Calendar.SECOND, scannerOfArithmeticOperation.nextInt());
                System.out.println(currentCalendar.getTime());
                break;
            case 2:
                System.out.println("Enter the difference: ");
                currentCalendar.add(Calendar.SECOND, -scannerOfArithmeticOperation.nextInt());
                System.out.println(currentCalendar.getTime());
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }
}
