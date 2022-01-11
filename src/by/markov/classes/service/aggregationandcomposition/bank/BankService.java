package by.markov.classes.service.aggregationandcomposition.bank;

import by.markov.classes.aggregationandcomposition.bank.Bank;
import by.markov.classes.aggregationandcomposition.bank.BankAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankService {

    public void getMenu(ArrayList<BankAccount> bankAccounts, ArrayList<Bank> banks) {
        int choosing;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1 - block bank account\n2 - unblock bank account\n" +
                    "3 - search bank account\n4 - sort bank accounts\n" +
                    "5 - get sum of client account\n6 - get positive/negative balances");
            choosing = scanner.nextInt();
            switch (choosing) {
                case 1:
                    blockAccount(bankAccounts);
                    break;
                case 2:
                    unblockAccount(bankAccounts);
                    break;
                case 3:
                    searchAccount(bankAccounts);
                    break;
                case 4:
                    sortAccounts(bankAccounts);
                    break;
                case 5:
                    getSumOfAccountsClient(bankAccounts);
                    break;
                case 6:
                    getBalances(banks);
                    break;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void printClients(ArrayList<Bank> banks) {
        for (Bank bank : banks) {
            System.out.println(bank);
        }
    }

    public ArrayList<BankAccount> blockAccount(ArrayList<BankAccount> accounts) {
        int accountNumberForBlocking;
        String customerNameForVerification;
        Scanner scannerOfAccount = new Scanner(System.in);
        Scanner scannerOfCustomer = new Scanner(System.in);
        try {
            System.out.println("Enter Account number for block: ");
            accountNumberForBlocking = scannerOfAccount.nextInt();
            System.out.println("Enter Customer name for verification:");
            customerNameForVerification = scannerOfCustomer.nextLine();
            for (BankAccount bankAccount : accounts) {
                if ((bankAccount.getNumber() == accountNumberForBlocking) && (bankAccount.getClient().getName().equalsIgnoreCase(customerNameForVerification))) {
                    bankAccount.setActive(false);
                    System.out.println(bankAccount);
                }
            }
        } catch (Exception e) {
            System.out.println(scannerOfAccount + "- unknown number or incorrect input.");
        }
        return accounts;
    }

    public ArrayList<BankAccount> unblockAccount(ArrayList<BankAccount> accounts) {
        int accountNumberForUnblock;
        String customerNameForVerification;
        Scanner scannerOfAccount = new Scanner(System.in);
        Scanner scannerOfCustomer = new Scanner(System.in);
        try {
            System.out.println("Enter Account number for unblock: ");
            accountNumberForUnblock = scannerOfAccount.nextInt();
            System.out.println("Enter Customer name for verification:");
            customerNameForVerification = scannerOfCustomer.nextLine();
            for (BankAccount bankAccount : accounts) {
                if ((bankAccount.getNumber() == accountNumberForUnblock) && (bankAccount.getClient().getName().equalsIgnoreCase(customerNameForVerification)) && (!bankAccount.isActive())) {
                    bankAccount.setActive(true);
                    System.out.println(bankAccount);
                }
            }
        } catch (Exception e) {
            System.out.println(scannerOfAccount + "- this is not a number.");
        }
        return accounts;
    }

    public void searchAccount(ArrayList<BankAccount> accounts) {
        int accountNumber;
        Scanner scannerOfAccount = new Scanner(System.in);
        try {
            System.out.println("Search. Enter account number: ");
            accountNumber = scannerOfAccount.nextInt();
            for (BankAccount account : accounts) {
                if (account.getNumber() == accountNumber) {
                    System.out.println(account);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        }
    }

    public ArrayList<BankAccount> sortAccounts(ArrayList<BankAccount> accounts) {
        accounts.sort(new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return (int) (o1.getNumber() - o2.getNumber());
            }
        });
        System.out.println("Sorted list:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
        return accounts;
    }

    public void getSumOfAccountsClient(ArrayList<BankAccount> accounts) {
        int moneySum = 0;
        String customerNameForVerification;
        Scanner scannerOfClient = new Scanner(System.in);
        try {
            System.out.println("Enter client name:");
            customerNameForVerification = scannerOfClient.nextLine();
            for (BankAccount account : accounts) {
                if ((account.getClient().getName().equalsIgnoreCase(customerNameForVerification)) && (account.isActive())) {
                    moneySum += account.getClient().getMoney();
                }
            }
            System.out.println("Client: " + customerNameForVerification + " | Money: " + moneySum);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        }
    }

    public void getMoneySumOfBank(ArrayList<Bank> banks) {
        int moneySum = 0;
        String bankName;
        Scanner scannerOfBank = new Scanner(System.in);
        try {
            System.out.println("Enter bank name:");
            bankName = scannerOfBank.nextLine();
            for (Bank bank : banks) {
                if (bank.getName().equalsIgnoreCase(bankName)) {
                    moneySum += bank.getBankAccount().getClient().getMoney();
                }
            }
            System.out.println("In " + bankName + " $" + moneySum);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        }
    }

    public void getBalances(ArrayList<Bank> banks) {
        int positiveBalance = 0;
        int negativeBalance = 0;
        for (Bank bank : banks) {
            if (bank.getBankAccount().getClient().getMoney() > 0) {
                positiveBalance += bank.getBankAccount().getClient().getMoney();
            } else if (bank.getBankAccount().getClient().getMoney() < 0) {
                negativeBalance += bank.getBankAccount().getClient().getMoney();
            }
        }
        System.out.println("General positive balance: $" + positiveBalance);
        System.out.println("General negative balance: $" + negativeBalance);
    }
}
