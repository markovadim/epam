package by.markov.classes.simpleclasses.customers;

import by.markov.classes.service.simpleclasses.customers.CustomerService;

public class Main {
    public static void main(String[] args) {
        Student studentOfFTK = new Student(true, "BSUIR", "FTK");
        Student studentOfFKP = new Student(true, "BSUIR", "FKP");
        Student studentOfFRE = new Student(true, "BSUIR", "FRE");

        Student notAStudent = new Student(false);
        Customer customer1 = new Customer(1, "Vadim", "Minsk", 1251735209000897L, 11122233321L, notAStudent);
        Customer customer2 = new Customer(2, "Volodya", "Minsk", 8799651354714432L, 19725382321L, studentOfFRE);
        Customer customer3 = new Customer(3, "Viktor", "Pinsk", 5455324100975348L, 10985382321L, studentOfFKP);
        Customer customer4 = new Customer(4, "Mihail", "Lida", 1441325428767544L, 17272382321L, studentOfFKP);
        Customer customer5 = new Customer(5, "Anna", "Lida", 4255314200971233L, 17008382321L, studentOfFTK);
        Customer customer6 = new Customer(6, "Olga", "Brest", 2331544400980990L, 10908382321L, studentOfFRE);
        Customer customer7 = new Customer(7, "Valery", "Borisov", 6545432234065620L, 15538382321L, notAStudent);
        Customer[] customers = new Customer[]{customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer7};

        CustomerService service = new CustomerService();
        service.getMenu(customers);
    }
}
