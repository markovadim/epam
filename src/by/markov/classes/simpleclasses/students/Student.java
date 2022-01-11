package by.markov.classes.simpleclasses.students;
//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив з пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.Arrays;

public class Student {

    private String name;
    private int groupNumber;
    private int[] rating = new int[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }

    public Student(String name, int groupNumber, int[] rating) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Name: " + name + ' ' + "| Group: " + groupNumber + " | Rating: " + Arrays.toString(rating);
    }
}
