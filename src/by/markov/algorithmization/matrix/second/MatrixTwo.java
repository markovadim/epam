package by.markov.algorithmization.matrix.second;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

import java.util.Scanner;

public class MatrixTwo {

    public void printDiagonal() {
        int matrix[][];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы n:");
        n = sc.nextInt();
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {                                   //вывод матрицы
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {                                   //вывод диагональных чисел
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
        sc.close();
    }
}
