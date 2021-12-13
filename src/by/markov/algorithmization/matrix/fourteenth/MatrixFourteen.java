package by.markov.algorithmization.matrix.fourteenth;
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Scanner;

public class MatrixFourteen {

    public void searchElement() {
        int[][] matrix;
        int n, m, max;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк ");
        n = sc.nextInt();
        System.out.println("Введите число столбцов ");
        m = sc.nextInt();

        matrix = new int[n][m];
        max = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    if (j % 2 == 0) {
                        matrix[i][j] = max;
                    }
                }
            } else {
                for (int j = 0; j < m; j++) {
                    if (j % 2 != 0) {
                        matrix[i][j] = max;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
        sc.close();
    }
}
