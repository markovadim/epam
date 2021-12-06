package by.markov.basic.circuits.first;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.getSum());
    }
}
