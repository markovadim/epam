package by.markov.algorithmization.matrix.twelveth;
//Отсортировать строки матрицы по возрастанию и убыванию значений элементов
// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTwelve {

    public void sortLines() {
        int n, m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк ");
        n = sc.nextInt();
        System.out.println("Введите число столбцов ");
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 20 + 0);
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            int[] array = new int[m];
            for (int j = 0; j < m; j++) {
                array[j] = matrix[i][j];
            }
            Arrays.sort(array);
            for (int k = 0; k < m; k++) {
                System.out.print(array[k] + "\t");
            }
            System.out.println();
            sc.close();
        }
    }

    public void sortVertical() {
        int n, m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк ");
        n = sc.nextInt();
        System.out.println("Введите число столбцов ");
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 20 + 0);
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n - 1; k++) {
                    for (int p = 0; p < m; p++) {
                        if (matrix[k][p] >= matrix[k + 1][p]) {
                            int temp;
                            temp = matrix[k][p];
                            matrix[k][p] = matrix[k + 1][p];
                            matrix[k + 1][p] = temp;
                        }
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
