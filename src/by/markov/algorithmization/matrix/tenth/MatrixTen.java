package by.markov.algorithmization.matrix.tenth;
// Найти положительные элементы главной диагонали квадратной матрицы

import java.util.Scanner;

public class MatrixTen {

    public void searchPositiveElements() {
        int matrix[][];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы n:");
        n = sc.nextInt();
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10 - 5);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        String txt = "Положительные элементы: ";

        for (int i = 0; i < n; i++) {                                   //вывод диагональных положительных чисел
            for (int j = 0; j < n; j++) {
                if ((j == i) && (matrix[i][j] > 0)) {
                    System.out.print(matrix[i][j] + "\t");
                    txt += "a[" + i + "][" + j + "] :" + matrix[i][j] + " ";
                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println(txt);
        sc.close();
    }
}
