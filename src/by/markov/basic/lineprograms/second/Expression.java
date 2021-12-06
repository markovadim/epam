package by.markov.basic.lineprograms.second;

public class Expression {

    public double getResultOfExpression(double a, double b, double c) {
        double b_squared = Math.pow(b, 2);
        double a_cube = Math.pow(a, 3);
        double b_minusSquared = Math.pow(a, 3);
        double root = b_squared + 4 * a * c;

        return ((b + Math.sqrt(root)) / 2 * a) - a_cube * c + b_minusSquared;
    }
}
