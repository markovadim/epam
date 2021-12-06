package by.markov.basic.lineprograms.fourth;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Main {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.printf("%.3f", reverse.getReverseDouble(333.111));
    }
}
