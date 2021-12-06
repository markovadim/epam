package by.markov.basic.circuits.eighth;

public class CheckNumbers {
    private final int TEN = 10;

    public void check(int firstNumber, int secondNumber) {
        int[] resultFirstArray = writeInArray(firstNumber);
        int[] resultSecondArray = writeInArray(secondNumber);
        for (int i = 0; i < resultFirstArray.length; i++) {
            for (int j = 0; j < resultSecondArray.length; j++) {
                if (resultFirstArray[i] == resultSecondArray[j]) {
                    System.out.print(" - " + resultFirstArray[i] + " - ");
                }
            }
        }
    }

    public int[] writeInArray(int number) {
        int[] array = new int[String.valueOf(Math.abs(number)).length()];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % TEN;
            number /= TEN;
        }
        return array;
    }
}
