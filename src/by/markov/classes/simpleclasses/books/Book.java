package by.markov.classes.simpleclasses.books;

public class Book {
    private String title;
    private String author;
    private PublishingHouse publishingHouse;
    private int year;
    private int numberOfPages;
    private int price;
    private String typeOfCover;

    public Book(String tittle, String author, PublishingHouse publishingHouse, int year, int numberOfPages, int price, String typeOfCover) {
        this.title = tittle;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfCover = typeOfCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    @Override
    public String toString() {
        return "Book " +
                "Title: " + title +
                "| Author: " + author +
                "| Publishing House: " + publishingHouse +
                "| Year: " + year +
                "| Number Of Pages: " + numberOfPages +
                "| Price : " + price + " rub" +
                "| Type Of Cover: " + typeOfCover;
    }
}
