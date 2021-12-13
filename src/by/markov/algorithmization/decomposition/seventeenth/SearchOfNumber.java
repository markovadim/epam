package by.markov.algorithmization.decomposition.seventeenth;
// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию

public class SearchOfNumber {
    public int findEventCount(int number) {
        int eventCounter = 0;

        while (number > 0) {
            int digitsSum = findDigitsSum(number);
            number -= digitsSum;
            eventCounter++;
        }

        return eventCounter;
    }

    private static int findDigitsSum(int number) {
        int digitsSum = 0;
        int[] digits = getNumberDigits(number);

        for (int i = 0; i < digits.length; i++) {
            digitsSum += digits[i];
        }

        return digitsSum;
    }

    private static int findNumberLength(int number) {
        int numberLength = 0;

        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }

    private static int[] getNumberDigits(int number) {
        int numberLength = findNumberLength(number);
        int[] numberDigits = new int[numberLength];

        for (int i = 1; i <= numberLength; i++) {
            int digit = (int) (number / Math.pow(10, i - 1)) % 10;
            numberDigits[numberLength - i] = digit;
        }

        return numberDigits;
    }

}
