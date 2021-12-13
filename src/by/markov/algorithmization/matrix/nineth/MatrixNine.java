package by.markov.algorithmization.matrix.nineth;
//Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму

import java.util.Scanner;

public class MatrixNine {

    public void getSumOfVertical() {
        int[][] matrix;
        int n, m, sumCurrent, sumCurrentSecond;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы n ");
        n = sc.nextInt();
        System.out.println("Введите размер матрицы m ");
        m = sc.nextInt();
        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {                           //заполнение массива
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 0);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int arrayOfSumElements[] = new int[m];

        for (int j = 0; j < m; j++) {
            sumCurrent = 0;
            for (int i = 0; i < n; i++) {
                sumCurrent += matrix[i][j];
                sumCurrentSecond = sumCurrent;
            }
            arrayOfSumElements[j] = sumCurrent;
        }
        int max = arrayOfSumElements[0];
        int numberVertical = 0;

        for (int j = 0; j < m; j++) {
            if (arrayOfSumElements[j] > max) {
                max = arrayOfSumElements[j];
                numberVertical = j;
            }
        }
        System.out.println("Максимальная сумма в столбце номер " + (numberVertical + 1));
        sc.close();
    }
}
