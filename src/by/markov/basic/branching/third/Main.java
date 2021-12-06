package by.markov.basic.branching.third;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Main {
    public static void main(String[] args) {
        ThreePoints threePoints = new ThreePoints();
        threePoints.lieOnTheLine(new int[]{1, 6}, new int[]{0, 4}, new int[]{5, 6});
        threePoints.lieOnTheLine(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
    }
}
