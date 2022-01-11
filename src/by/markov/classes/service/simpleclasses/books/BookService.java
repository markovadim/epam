package by.markov.classes.service.simpleclasses.books;

import by.markov.classes.simpleclasses.books.Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookService {

    public void getMenu(Book[] books) {
        int choosing;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - print all books of your author\n2 - print all books of publishing house\n3 - print books after your year");
            choosing = input.nextInt();
            switch (choosing) {
                case 1:
                    printBooksWithUsersAuthor(books);
                    break;
                case 2:
                    printBooksOfPublishingHouse(books);
                    break;
                case 3:
                    printBooksAfterUsersYear(books);
                    break;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void printAllBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void printBooksWithUsersAuthor(Book[] books) {
        String userAuthor;
        Scanner scannerOfAuthor = new Scanner(System.in);
        try {
            System.out.println("Enter author: ");
            userAuthor = scannerOfAuthor.nextLine();
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(userAuthor)) {
                    System.out.println(book.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Author is missing or incorrect input.");
        }
        scannerOfAuthor.close();
    }

    public void printBooksOfPublishingHouse(Book[] books) {
        String userPublishingHouse;
        Scanner scannerOfPublishingHouse = new Scanner(System.in);
        try {
            System.out.println("Enter publishing house: ");
            userPublishingHouse = scannerOfPublishingHouse.nextLine();
            for (Book book : books) {
                if (book.getPublishingHouse().getName().equalsIgnoreCase(userPublishingHouse)) {
                    System.out.println(book.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Publishing House is missing or incorrect input.");
        }
        scannerOfPublishingHouse.close();
    }

    public void printBooksAfterUsersYear(Book[] books) {
        int userYear;
        Scanner scannerOfUserYear = new Scanner(System.in);
        try {
            System.out.println("Enter year: ");
            userYear = scannerOfUserYear.nextInt();
            for (Book book : books) {
                if (book.getYear() > userYear) {
                    System.out.println(book.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("You enter not a year.");
        }
        scannerOfUserYear.close();
    }
}
