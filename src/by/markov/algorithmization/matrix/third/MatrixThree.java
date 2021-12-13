package by.markov.algorithmization.matrix.third;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.Scanner;

public class MatrixThree {

    public void changeElements() {
        int matrix[][];
        int n, m;
        int k, p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк n:");
        n = sc.nextInt();
        System.out.println("Введите количество столбцов m:");
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

        System.out.println("Введите индекс строки k:");
        k = sc.nextInt();

        if (k < n) {
            System.out.println('\n' + "Строка с индексом " + k + " :");
            for (int i = 0; i < n; i++) {
                if (i == k) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        } else System.out.println("Строки с таким индексом нет");

        System.out.println("Введите индекс столбца p:");
        p = sc.nextInt();

        if (p < m) {
            System.out.println("Столбец с индексом " + p + " :");
            for (int j = 0; j < m; j++) {
                if (j == p) {
                    for (int i = 0; i < n; i++) {
                        System.out.println(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } else System.out.println("Столбца с таким индексом нет");
        sc.close();
    }
}
