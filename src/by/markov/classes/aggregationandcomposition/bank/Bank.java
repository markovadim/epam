package by.markov.classes.aggregationandcomposition.bank;

public class Bank {
    private String name;
    private BankAccount bankAccount;

    public Bank(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Bank: " + name + " " + bankAccount;
    }
}
