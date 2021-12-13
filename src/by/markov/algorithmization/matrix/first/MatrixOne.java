package by.markov.algorithmization.matrix.first;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Scanner;

public class MatrixOne {

    public void getMatrix() {
        int[][] matrix;
        int n, m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность n:");
        n = sc.nextInt();
        System.out.println("Введите размерность m:");
        m = sc.nextInt();
        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (matrix[0][j] > matrix[n - 1][j]) {
                        System.out.println(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            } else continue;
        }
        sc.close();
    }
}
