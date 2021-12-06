package by.markov.basic.branching.fourth;

public class Brick {
    public boolean checkBrick(int[] sizeOfBrick, int[] sizeOfHole) {
        if ((sizeOfBrick[0] <= sizeOfHole[0]) && (sizeOfBrick[1] <= sizeOfHole[1])) {
            return true;
        } else {
            return false;
        }
    }
}
