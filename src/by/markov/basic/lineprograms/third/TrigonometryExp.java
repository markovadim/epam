package by.markov.basic.lineprograms.third;

public class TrigonometryExp {
    public double getTrigonometryExpression(double x, double y) {
        double x_sin = Math.sin(x);
        double y_sin = Math.sin(y);
        double x_cos = Math.cos(x);
        double y_cos = Math.cos(y);
        double xy_tg = Math.tan(x * y);

        return (x_sin + y_cos) / (x_cos - y_sin) * xy_tg;
    }
}
