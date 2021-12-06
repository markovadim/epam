package by.markov.basic.branching.first;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.isRectangular(100, 70);
    }
}
