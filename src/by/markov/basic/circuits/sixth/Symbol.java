package by.markov.basic.circuits.sixth;

public class Symbol {
    final int START_SYMBOL = 32;
    private final int END_SYMBOL = 126;

    public void printSymbols() {
        for (int i = START_SYMBOL; i <= END_SYMBOL; i++) {
            System.out.print((char) i + "|");
        }
    }
}
