package by.markov.basic.lineprograms.third;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)∗ 𝑡𝑔 𝑥�

public class Main {
    public static void main(String[] args) {
        TrigonometryExp trigonometryExp = new TrigonometryExp();
        System.out.println(trigonometryExp.getTrigonometryExpression(0.5, 0.5));
    }
}
