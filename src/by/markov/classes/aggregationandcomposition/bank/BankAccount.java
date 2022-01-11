package by.markov.classes.aggregationandcomposition.bank;

public class BankAccount {
    private long number;
    private Client client;
    private boolean isActive;

    public BankAccount(long number, Client customer) {
        this.number = number;
        this.client = customer;
        this.isActive = true;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        if (isActive) {
            return "Account: " + number + ", Client " + client + "| Status: is active.";
        } else {
            return "Account: " + number + ", Client " + client + "| Status: is blocked.";
        }
    }
}
