package by.markov.basicsofoop.services.presents;

import by.markov.basicsofoop.presents.Box;
import by.markov.basicsofoop.presents.BoxSize;
import by.markov.basicsofoop.presents.Color;

public class BoxBuilderManager implements BoxBuilder {
    private final double BOW_PRICE = 3.1;
    Box box = new Box();

    @Override
    public BoxBuilder setBoxSize(BoxSize boxSize) {
        box.setBoxSize(boxSize);
        return this;
    }

    @Override
    public BoxBuilder setColor(Color color) {
        box.setColor(color);
        return this;
    }

    @Override
    public BoxBuilder setBow(boolean bow) {
        box.setBow(bow);
        return this;
    }

    @Override
    public BoxBuilder setPrice() {
        if (box.isBow()) {
            box.setBoxPrice(box.getBoxSize().getPrice() + BOW_PRICE);
        } else {
            box.setBoxPrice(box.getBoxSize().getPrice());
        }
        return this;
    }

    @Override
    public Box build() {
        return box;
    }
}
