package by.markov.basic.lineprograms.sixth;

public class SystemOfCoordinate {
    final int FIRST_BORDER_OF_X = 2;
    final int SECOND_BORDER_OF_X = 4;
    final int BORDER_OF_Y = 4;
    final int ZERO = 0;

    public void checkPoint(int x, int y) {
        if (y >= ZERO) {
            System.out.println(checkIfYPositive(x, y));
        } else {
            System.out.println(checkIfYNegative(x, y));
        }
    }

    public boolean checkIfYPositive(int x, int y) {
        if ((x <= FIRST_BORDER_OF_X) && (x >= -FIRST_BORDER_OF_X) && (y <= BORDER_OF_Y) && (y >= ZERO)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfYNegative(int x, int y) {
        if ((x <= SECOND_BORDER_OF_X) && (x >= -SECOND_BORDER_OF_X) && (y <= ZERO) && (y >= -BORDER_OF_Y)) {
            return true;
        } else {
            return false;
        }
    }
}
