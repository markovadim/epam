package by.markov.classes.simpleclasses.trains;
//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
//Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с
// одинаковыми пунктами назначения должны быть упорядочены по времени отправления


import java.util.Date;

public class Train {
    private int number;
    private String destination;
    private Date time;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Train(int number, String destination, Date time) {
        this.number = number;
        this.destination = destination;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Train: " + "Number - " + number + "| Destination - " + destination + "| Time -" + time + '\n';
    }
}
