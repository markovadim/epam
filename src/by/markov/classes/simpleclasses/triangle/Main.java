package by.markov.classes.simpleclasses.triangle;

import by.markov.classes.service.simpleclasses.triangle.TriangleService;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        Point c = new Point(6, 1);

        Triangle triangle = new Triangle(a, b, c);

        TriangleService triangleService = new TriangleService();
        triangleService.getMenu(triangle);
    }
}
