package by.markov.basic.lineprograms.fifth;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class Main {
    public static void main(String[] args) {
        TimeOfUser time = new TimeOfUser();
        time.getFormatTime(659);
    }
}
