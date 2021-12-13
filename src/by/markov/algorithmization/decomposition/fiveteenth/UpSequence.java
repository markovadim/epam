package by.markov.algorithmization.decomposition.fiveteenth;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class UpSequence {
    private final int TEN = 10;

    public void findGrowingNumbers(int n) {
        int startValue = (int) Math.pow(TEN, n - 1);

        for (int i = startValue; i < startValue * TEN; i++) {
            int growingNumbersCount = 0;

            for (int j = 1; j < n; j++) {
                int rightDigit = (int) (i / Math.pow(10, j - 1)) % 10;
                int leftDigit = (int) (i / Math.pow(10, j)) % 10;

                if (leftDigit < rightDigit) {
                    growingNumbersCount++;
                }
                if (growingNumbersCount == n - 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
