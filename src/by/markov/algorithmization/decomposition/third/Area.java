package by.markov.algorithmization.decomposition.third;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника

public class Area {

    public void getAreaOfSixAngle() {
        double side = Math.random() * 101;
        System.out.println("Сторона шестиугольника " + side);
        double S = side * side * Math.sqrt(side) / 4;
        System.out.println("Площадь шестиугольника: " + 6 * S);
    }
}
