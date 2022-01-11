package by.markov.classes.service.simpleclasses.triangle;

import by.markov.classes.simpleclasses.triangle.Point;
import by.markov.classes.simpleclasses.triangle.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleService {
    private final int INDEX = 3;

    public void getMenu(Triangle triangle) {
        int choosing;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("1 - get perimeter\n2 - get square\n3 - get point of crossing");
            choosing = input.nextInt();
            switch (choosing) {
                case 1:
                    perimeter(triangle);
                    break;
                case 2:
                    square(triangle);
                    break;
                case 3:
                    getPointOfCrossing(triangle);
                    break;
                default:
                    System.out.println("Operation not fount");
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        input.close();

    }

    public double perimeter(Triangle triangle) {
        double firstLength = PointService.length(triangle.getA(), triangle.getB());
        double secondLength = PointService.length(triangle.getB(), triangle.getC());
        double thirdLength = PointService.length(triangle.getC(), triangle.getA());
        return firstLength + secondLength + thirdLength;
    }

    public double square(Triangle triangle) {
        double firstLength = PointService.length(triangle.getA(), triangle.getB());
        double secondLength = PointService.length(triangle.getB(), triangle.getC());
        double thirdLength = PointService.length(triangle.getC(), triangle.getA());
        double pPerimeter = perimeter(triangle) / 2;
        return Math.sqrt(pPerimeter * (pPerimeter - firstLength) * (pPerimeter - secondLength) * (pPerimeter - thirdLength));
    }

    public Point getPointOfCrossing(Triangle triangle) {
        double x = (triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / INDEX;
        double y = (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / INDEX;
        return new Point(x, y);
    }
}
