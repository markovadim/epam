package by.markov.algorithmization.matrix.thirteenth;
//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца

import java.util.Scanner;

public class MatrixThirteen {

    public void getMatrixZero() {
        int[][] matrix;
        int n, m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк ");
        n = sc.nextInt();
        System.out.println("Введите число столбцов ");
        m = sc.nextInt();
        matrix = new int[n][m];

        for (int j = 0; j < m; j++) {
            int count = j;
            for (int i = 0; i < n; i++) {
                if (count > 0) {
                    matrix[i][j] = 1;
                    count--;
                } else matrix[i][j] = 0;
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
