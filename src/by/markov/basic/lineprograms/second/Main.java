package by.markov.basic.lineprograms.second;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):(𝑏 + √(𝑏^2 + 4𝑎𝑐))/2𝑎− 𝑎^3𝑐 + 𝑏^−2

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        System.out.println(expression.getResultOfExpression(2.2, 3.3, 4.4));
    }
}
