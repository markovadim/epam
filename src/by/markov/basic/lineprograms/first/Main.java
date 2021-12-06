package by.markov.basic.lineprograms.first;
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

public class Main {
    public static void main(String[] args) {
        FunctionOfZ functionOfZ = new FunctionOfZ();
        System.out.printf("%.2f", functionOfZ.getResult(2.2, 3.3, 4.4));
    }
}
