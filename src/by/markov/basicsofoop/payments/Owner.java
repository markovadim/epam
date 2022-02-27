package by.markov.basicsofoop.payments;

public class Owner {
    private String name;
    private int password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Owner(String name, int password) {
        this.name = name;
        this.password = password;
    }
}
