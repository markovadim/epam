package by.markov.algorithmization.decomposition.nineth;
// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

import java.util.Scanner;

public class AreaOfQuadrangle {

    public void getArea() {
        int x, y, z, t;
        double diagonal, AreaRes, AreaOne, AreaTwo, semiPerimeter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = sc.nextInt();
        System.out.println("Enter Y: ");
        y = sc.nextInt();
        System.out.println("Enter Z: ");
        z = sc.nextInt();
        System.out.println("Enter T: ");
        t = sc.nextInt();

        diagonal = Math.sqrt(x * x + y * y);

        AreaOne = (double) (x * y) / 2;
        semiPerimeter = (z + t + diagonal) / 2;

        AreaTwo = Math.sqrt(semiPerimeter * (semiPerimeter - z) * (semiPerimeter - t) * (semiPerimeter - diagonal));
        AreaRes = AreaOne + AreaTwo;

        System.out.println("Площадь прямоугольного треугольника" + AreaOne);
        System.out.println("Площадь треугольника по трем сторонам" + AreaTwo);
        System.out.println("Итоговая площадь четырехугольника " + AreaRes);
        sc.close();
    }
}
