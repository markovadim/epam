package by.markov.algorithmization.sortarrays.sixth;
//Сортировка Шелла

public class ShellsSort {

    public void solution(int[] array) {
        int increment = array.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            increment = increment / 2;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();

    }

    public void insertionSort(int[] array, int startIndex, int increment) {
        for (int i = startIndex; i < array.length - 1; i = i + increment) {
            for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment) {
                if (array[j - increment] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - increment];
                    array[j - increment] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}
