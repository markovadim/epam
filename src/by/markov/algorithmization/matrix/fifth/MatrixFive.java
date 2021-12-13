package by.markov.algorithmization.matrix.fifth;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class MatrixFive {
    public void getSquareMatrix() {
        int matrix[][];
        int n;

        Scanner sc = new Scanner(System.in);
        do {                                                            //цикл на нечетное число
            System.out.println("Введите Четную размерность матрицы n:");
            n = sc.nextInt();
        } while (n % 2 != 0);

        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    matrix[i][j] = i + 1;
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
