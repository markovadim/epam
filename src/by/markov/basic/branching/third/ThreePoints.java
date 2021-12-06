package by.markov.basic.branching.third;

public class ThreePoints {
    public boolean lieOnTheLine(int[] aPoint, int[] bPoint, int[] cPoint) {
        if ((cPoint[0] - aPoint[0]) / (bPoint[0] - aPoint[0]) == (cPoint[1] - aPoint[1]) / (bPoint[1] - aPoint[1])) {
            System.out.println("This points lie on the line.");
            return true;
        } else {
            System.out.println("These points don't lie on the line.");
            return false;
        }
    }
}
