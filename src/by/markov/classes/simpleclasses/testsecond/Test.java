package by.markov.classes.simpleclasses.testsecond;
//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//        класса

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

    public Test() {
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
