package by.markov.algorithmization.matrix.sixth;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class MatrixSix {

    public void getSquareMatrix() {
        int matrix[][];
        int n;

        Scanner sc = new Scanner(System.in);
        do {                                                            //цикл на четное число
            System.out.println("Введите Четную размерность матрицы n:");
            n = sc.nextInt();
        } while (n % 2 != 0);
        matrix = new int[n][n];

        for (int i = 0; i < n / 2; i++) {                                    //заполнение половины массива по строкам
            for (int j = 0; j < n; j++) {
                if ((j < i) || (i + j >= n)) {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

        for (int i = n / 2; i < n; i++) {                                     //заполнение второй половины массива
            for (int j = 0; j < n; j++) {
                if ((j > i) || (j < n - 1 - i)) {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
