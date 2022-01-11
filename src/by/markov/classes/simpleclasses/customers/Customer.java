package by.markov.classes.simpleclasses.customers;

import java.text.DecimalFormat;

public class Customer {
    private int id;
    private String name;
    private String address;
    private long numberOfCard;
    private long numberOfBank;
    private Student student;
    private String CARD_FORMAT = "####,####,####,####";

    public Customer(int id, String name, String address, long numberOfCard, long numberOfBank, Student student) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfCard = numberOfCard;
        this.numberOfBank = numberOfBank;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(long numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public long getNumberOfBank() {
        return numberOfBank;
    }

    public void setNumberOfBank(long numberOfBank) {
        this.numberOfBank = numberOfBank;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat(CARD_FORMAT);
        return "Customer" +
                " id=" + id +
                " | Name: " + name +
                " | Address: " + address +
                " | Number Of Card: " + decimalFormat.format(numberOfCard) +
                " | Number Of Bank: " + numberOfBank +
                " | Student: " + student;
    }
}
