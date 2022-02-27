package by.markov.basicsofoop.services.presents;

import by.markov.basicsofoop.presents.Box;
import by.markov.basicsofoop.presents.BoxSize;
import by.markov.basicsofoop.presents.Color;

public interface BoxBuilder {
    BoxBuilder setBoxSize(BoxSize boxSize);

    BoxBuilder setColor(Color color);

    BoxBuilder setBow(boolean bow);

    BoxBuilder setPrice();

    Box build();
}
