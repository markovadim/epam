package by.markov.algorithmization.matrix.eleventh;
//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class MatrixEleven {

    public void getMatrix() {
        int matrix[][] = new int[10][20];
        String txt = "Номера строк : ";

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 16 + 0);
                if (matrix[i][j] == 5) {
                    count++;
                }
                System.out.print(matrix[i][j] + " \t");
            }
            if (count >= 3) txt += "" + (i + 1) + "; ";
            System.out.println();
        }
        System.out.println(txt);
    }
}
