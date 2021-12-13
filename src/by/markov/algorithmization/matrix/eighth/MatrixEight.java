package by.markov.algorithmization.matrix.eighth;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class MatrixEight {

    public void changeElements() {
        int matrix[][];
        int n, m, k, p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк n: ");
        n = sc.nextInt();
        System.out.println("Введите количество столбцов n: ");
        m = sc.nextInt();

        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Введите первый столбец, который нужно заменить: ");
        k = sc.nextInt();

        if ((m >= k) && (k > 0)) {
            System.out.println("Введите второй столбец, который нужно заменить: ");
            p = sc.nextInt();
            if ((m >= p) && (p > 0)) {
                int temp;
                for (int i = 0; i < n; i++) {
                    temp = matrix[i][k - 1];
                    for (int j = 0; j < m; j++) {
                        matrix[i][k - 1] = matrix[i][p - 1];
                        matrix[i][p - 1] = temp;
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else System.out.println("Не существует столбца номер " + p);
        } else System.out.println("Не существует столбца номер " + k);
        sc.close();
    }
}
