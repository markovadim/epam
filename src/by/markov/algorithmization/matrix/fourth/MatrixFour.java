package by.markov.algorithmization.matrix.fourth;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

import java.util.Scanner;

public class MatrixFour {

    public void getReverse() {
        int matrix[][];
        int n;

        Scanner sc = new Scanner(System.in);
        do {                                                            //цикл на нечетное число
            System.out.println("Введите Четное количество строк n:");
            n = sc.nextInt();
        } while (n % 2 != 0);

        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {                                    //заполнение нечетных строк с Четным индексом
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (int) (1 + j);
                    System.out.print(matrix[i][j] + "\t");
                }
            } else {
                for (int j = 0; j < n; j++) {                   //заполнение четных строк с нечетным индексом риверсом первой строки
                    matrix[i][j] = (int) (n - j);
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
