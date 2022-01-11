package by.markov.classes.simpleclasses.testfirst;

import by.markov.classes.service.simpleclasses.test.TestService;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(1,4);
        TestService service = new TestService();
        service.changeVariables(test);
    }
}
