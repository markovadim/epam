package by.markov.basic.branching.first;

public class Triangle {
    private final int SUM_OF_ANGLES_TRIANGLE = 180;
    private final int RIGHT_ANGLE = 90;

    public boolean isTriangle(int firstAngle, int secondAngle) {
        if ((firstAngle + secondAngle) < SUM_OF_ANGLES_TRIANGLE) {
            System.out.println("Can have triangle.");
            return true;
        } else {
            return false;
        }
    }

    public boolean isRectangular(int firstAngle, int secondAngle) {
        if (isTriangle(firstAngle, secondAngle)) {
            if ((firstAngle == RIGHT_ANGLE) || (secondAngle == RIGHT_ANGLE) || (SUM_OF_ANGLES_TRIANGLE - firstAngle - secondAngle == RIGHT_ANGLE)) {
                System.out.println("This triangle is rectangular.");
            } else {
                System.out.println("This triangle is not rectangular.");
            }
            return true;
        } else {
            return false;
        }
    }
}
