package by.markov.basic.branching.fourth;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие

public class Main {
    public static void main(String[] args) {
        Brick brick = new Brick();
        System.out.println(brick.checkBrick(new int[]{5, 1, 1}, new int[]{4, 4}));
        System.out.println(brick.checkBrick(new int[]{3, 1, 1}, new int[]{4, 4}));
    }
}
