package by.markov.classes.service.simpleclasses.triangle;

import by.markov.classes.simpleclasses.triangle.Point;

public class PointService {

    public static double length(Point a, Point b) {
        return Math.sqrt(Math.pow((b.getX() - a.getY()), 2) + Math.pow((b.getY() - a.getY()), 2));
    }
}
