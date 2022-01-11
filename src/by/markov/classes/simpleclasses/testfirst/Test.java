package by.markov.classes.simpleclasses.testfirst;
//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//        переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//        наибольшее значение из этих двух переменных


public class Test {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
