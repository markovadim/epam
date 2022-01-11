package by.markov.classes.aggregationandcomposition.bank;

import by.markov.classes.service.aggregationandcomposition.bank.BankService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client vadim = new Client("Vadim", 200);
        Client ivan = new Client("Ivan", -300);
        Client olya = new Client("Olya", 140);
        Client yuliya = new Client("Yuliya", 440);

        BankAccount first = new BankAccount(420987003, vadim);
        BankAccount second = new BankAccount(221009008, ivan);
        BankAccount third = new BankAccount(324009008, yuliya);
        BankAccount fourth = new BankAccount(775009008, vadim);

        Bank belarusbank = new Bank("BELARUSBANK", first);
        Bank bsb = new Bank("BSB", second);
        Bank alpha = new Bank("AlphaBank", third);
        Bank priorbank = new Bank("Priorbank", fourth);

        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(belarusbank);
        banks.add(bsb);
        banks.add(alpha);
        banks.add(priorbank);

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(first);
        bankAccounts.add(second);
        bankAccounts.add(third);
        bankAccounts.add(fourth);

        BankService bankService = new BankService();
        bankService.getMenu(bankAccounts, banks);
    }
}
